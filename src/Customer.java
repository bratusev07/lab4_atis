import models.Book;

public interface Customer {
    void viewBooks();

    void getBookFromLibrary(String author, String name);

    void getBookFromLibrary(Book book);

    Book returnBook();

    void payFine();
}
