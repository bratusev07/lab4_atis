import models.Book;
import models.BookCard;
import models.BookInsert;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Observer observer1 = new People("Ivan", null, "123-GH");
        Observer observer2 = new People("Nikolay", null, "124-GH");

        library.attachObserver(observer1);
        library.attachObserver(observer2);

        BookInsert insert = new BookInsert.BookInsertBuilder()
                .setDate("12/06/2023")
                .setDeadline("15/06/2023")
                .setTicketNumber("123-GH")
                .build();

        BookCard card = new BookCard.BookCardBuilder()
                .setData("Data")
                .setBookShelf("3F")
                .setCount(234)
                .setLibraryDepartment("Художественный")
                .build();

        Book book = new Book(insert, card);

        library.addBook(book);
        System.out.println("\n=================================\n");
        library.addBook(book);
        library.addBook(book);

        System.out.println("\n=================================\n");
        library.removeBook(book);
    }
}