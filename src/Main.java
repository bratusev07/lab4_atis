import models.Book;
import models.BookCard;
import models.BookInsert;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        ProxyPeople people = new ProxyPeople("Ivan", "123-GH");

        library.attachObserver(people);

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

        people.authorizeLibrarian();

        people.getCustomerBook();
        people.getLibraryBook(book);
        people.returnBook();
        people.returnBook(book);
        people.issueFine();
        people.payFine();
        people.writeInCard(book);
        people.writeOff(book);
        people.viewBooks();


        library.addBook(book);
        System.out.println("\n=================================\n");
        library.removeBook(book);
    }
}