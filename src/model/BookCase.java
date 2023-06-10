package model;

import java.util.Map;
import java.util.TreeMap;

/** Класс Книжный шкаф
 * Хранит мап книжных полок
 * Реализует метод добавления и удаления полок в шкаф и гетер для мапа полок*/
public class BookCase {
    private Map<String, BookShelf> bookShelves; // мап вида <автор полки, полка>

    public BookCase() {
        bookShelves = new TreeMap<>();
    }

    public Map<String, BookShelf> getBookShelves() {
        return bookShelves;
    }

    public void addShelf(String author, BookShelf shelf) {
        bookShelves.put(author, shelf);
    }

    public void removeShelf(String author) {
        bookShelves.remove(author);
    }
}
