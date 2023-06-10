package model;

import java.util.ArrayList;

/** Класс Книжная полка
 * Хранит массив книг на полке
 * Реализует поиск книги на полке по названию */
public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book findBook(String bookName){
        for (Book book : books) {
            if(book.getBookCard().getData().equals(bookName)) return book;
        }
        return null;
    }

    /** Метод для добавления книги на полку*/
    public boolean addBook(Book book) {
        return books.add(book);
    }

    /** Метод для удаления книги с полки */
    public boolean removeBook(Book book) {
        return books.remove(book);
    }
}
