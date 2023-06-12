import models.Book;
import models.BookInsert;

import java.util.ArrayList;

public class ProxyPeople implements Observer, Customer, Librarian {
    private RealCustomer customer = null;
    private RealLibrarian librarian = null;
    private boolean authorization = false;

    private String name;
    private String ticketNumber;
    private Book book;

    public ProxyPeople(String name, String ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.book = null;
    }

    public void authorizeCustomer() {
        if (!authorization) {
            customer = new RealCustomer(name, ticketNumber);
            authorization = true;
            System.out.println("Авторизация пользователя прошла успешно.");
        } else {
            System.out.println("Пользователь уже авторизован.");
        }
    }

    public void authorizeLibrarian() {
        if (!authorization) {
            librarian = new RealLibrarian(name, ticketNumber);
            authorization = true;
            System.out.println("Авторизация библиотекаря прошла успешно.");
        } else {
            System.out.println("Библиотекарь уже авторизован.");
        }
    }

    @Override
    public void update(ArrayList<Book> books) {
        if(customer != null)System.out.println("Dear " + customer.getName() + ", we have some changes in library");
        else if(librarian != null)System.out.println("Dear " + librarian.getName() + ", we have some changes in library");
        else System.out.println("Пожалуйста авторизуйтесь для получения уведомлений");
    }

    @Override
    public void viewBooks() {
        System.out.println("Вы смотрите книги");
    }

    @Override
    public Book getCustomerBook() {
        if(librarian != null && authorization) return librarian.getCustomerBook();
        else System.out.println("Авторизуйтесь как библиотекарь");
        return null;
    }

    @Override
    public void writeInCard(Book book) {
        if(librarian != null && authorization) book.setBookInsert(new BookInsert.BookInsertBuilder()
                .setDate("01/01/2023")
                .build());
        else System.out.println("Авторизуйтесь как библиотекарь");
    }

    @Override
    public void returnBook(Book book) {
        if(librarian != null && authorization) librarian.returnBook(book);
        else System.out.println("Авторизуйтесь как библиотекарь");
    }

    @Override
    public void getLibraryBook(Book book) {
        if(customer != null && authorization) customer.getLibraryBook(book);
        else System.out.println("Авторизуйтесь как пользователь");
    }

    @Override
    public Book returnBook() {
        if(customer != null && authorization) return customer.returnBook();
        else System.out.println("Авторизуйтесь как пользователь");
        return null;
    }

    @Override
    public void writeOff(Book book) {
        if(librarian != null && authorization) librarian.writeOff(book);
        else System.out.println("Авторизуйтесь как библиотекарь");
    }

    @Override
    public void issueFine() {
        if(librarian != null && authorization) librarian.issueFine();
        else System.out.println("Авторизуйтесь как библиотекарь");
    }

    @Override
    public void payFine() {
        if(customer != null && authorization) customer.payFine();
        else System.out.println("Авторизуйтесь как пользователь");
    }
}
