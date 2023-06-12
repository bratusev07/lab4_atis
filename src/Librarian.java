import models.Book;

public interface Librarian {
    void viewBooks();

    Book getCustomerBook();

    void writeInCard(Book book);

    void returnBook(Book book);

    void writeOff(Book book);

    void issueFine();
}
