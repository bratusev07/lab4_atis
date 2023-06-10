package model;

/** Класс Карточка
 * Хранит информацию о расположении книги и о количестве её экземпляров
 * Реализует гетеры полей класса*/
public class BookCard {
    private String data; // Выходные данные
    private String libraryDepartment; // Отдел библиотеки
    private String bookShelf; // Полка на которой находится книга
    private int count;  // Количество экземпляров книги

    public BookCard(String data, String libraryDepartment, String bookShelf, int count) {
        this.data = data;
        this.libraryDepartment = libraryDepartment;
        this.bookShelf = bookShelf;
        this.count = count;
    }

    public String getData() {
        return data;
    }

    public String getLibraryDepartment() {
        return libraryDepartment;
    }

    public String getBookShelf() {
        return bookShelf;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "BookInsert{" + data + " " + libraryDepartment + " " + bookShelf + '}';
    }
}
