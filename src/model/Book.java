package model;

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

    public void setBookInsert(BookInsert bookInsert) {
        this.bookInsert = bookInsert;
    }

    public void setBookCard(BookCard bookCard) {
        this.bookCard = bookCard;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookInsert=" + bookInsert +
                ", bookCard=" + bookCard +
                '}';
    }
}
