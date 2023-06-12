import models.Book;
import models.BookCard;
import models.BookInsert;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        ProxyPeople people = new ProxyPeople("Ivan", "123-GH", library);

        library.attachObserver(people);

        BookInsert insert = new BookInsert.BookInsertBuilder()
                .setDate("12/06/2023")
                .setDeadline("15/06/2023")
                .setTicketNumber("123-GH")
                .build();

        BookCard card = new BookCard.BookCardBuilder()
                .setName("Золотая рыбка")
                .setBookShelf("Пушкин А.С.")
                .setCount(234)
                .setLibraryDepartment("Художественный")
                .build();

        Book book = new Book(insert, card);

        library.addBook(book);

        people.authorizeCustomer();

        System.out.println(people.getBookForCustomer("Пушкин А.С.", "Золотая рыбка"));
        people.getBookFromLibrary("Пушкин А.С.", "Золотая рыбка");
        people.returnBook();
        people.returnBook(book);
        people.issueFine();
        people.payFine();
        people.writeInCard(book);
        people.writeOff(book);
        people.viewBooks();
    }
}