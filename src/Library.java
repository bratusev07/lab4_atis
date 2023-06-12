import models.Book;

import java.util.ArrayList;

public class Library implements Subject {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();

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
