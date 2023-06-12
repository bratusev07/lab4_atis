import models.Book;

public class RealLibrarian implements Librarian{
    private String name;
    private String ticketNumber;
    private Book book;

    public RealLibrarian(String name, String ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.book = null;
    }

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public void viewBooks() {
        System.out.println("Библиотекарь смотрите книги");
    }

    @Override
    public Book getCustomerBook() {
        return null;
    }

    @Override
    public void writeInCard(Book book) {

    }

    @Override
    public void returnBook(Book book) {

    }

    @Override
    public void writeOff(Book book) {
        System.out.println("Списать книгу");
    }

    @Override
    public void issueFine() {
        System.out.println("Выписать штраф");
    }
}
