package models;

public class Book {
    private BookInsert bookInsert;
    private BookCard bookCard;

    public Book(BookInsert bookInsert, BookCard bookCard) {
        this.bookInsert = bookInsert;
        this.bookCard = bookCard;

    }

    public BookInsert getBookInsert() {
        return bookInsert;
    }

    public BookCard getBookCard() {
        return bookCard;
    }

    @Override
    public String toString() {
        return "[" + bookInsert + " " + bookCard + ']';
    }
}
