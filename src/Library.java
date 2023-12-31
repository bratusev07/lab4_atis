import models.Book;
import models.BookCard;

import java.util.ArrayList;

public class Library implements Subject {
    private ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Observer> observers = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book findBook(String author, String name){
        Book book = null;
        for (Book b : books) {
            BookCard bookCard = b.getBookCard();
            if(bookCard.getBookShelf().equals(author) && bookCard.getName().equals(name)) book = b;
        }
        return book;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObserver();
    }

    public void removeBook(Book book) {
        books.remove(book);
        notifyObserver();
    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(books);
        }
    }
}
