import models.Book;

public class RealCustomer implements Customer{
    private String name;
    private String ticketNumber;
    private Book book;

    public RealCustomer(String name, String ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public void viewBooks() {
        System.out.println("Пользователь смотрите книги");
    }

    @Override
    public void getLibraryBook(Book book) {
        if (this.book == null) this.book = book;
    }

    @Override
    public Book returnBook() {
        Book tmp = book;
        book = null;
        return tmp;
    }

    @Override
    public void payFine() {
        System.out.println("Оплатить штраф");
    }
}
