import models.Book;

public interface Customer{
    void viewBooks();

    void getLibraryBook(Book book);

    Book returnBook();

    void payFine();
}
