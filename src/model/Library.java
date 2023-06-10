package model;

import java.util.Map;
import java.util.TreeMap;

/** Класс Библиотека.
 * Хранит всю информацию о состоянии библиотеки (отделы, книги и т.п.)
 * Реализует метод для поиска книг*/
public class Library {
    private String libraryName; // Название библиотеки
    private String address; // Адрес библиотеки
    private Map<String, LibraryDepartment> departments; // Мап <название отдела, отдел>

    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        departments = new TreeMap<>();
    }

    /** Возвращает книгу по названию отдела, автору и названию книги */
    public Book getBook(String departmentName, String author, String bookName) {
        return departments.get(departmentName).findShelfByAuthor(author, bookName);
    }

    /** Метод для добавления отделов в библиотеку*/
    //TODO: Заменить на Builder
    public void addDepartment(String departmentName, LibraryDepartment department) {
        departments.put(departmentName, department);
    }

    /** Метод для удаления отделов из библиотеки */
    public void removeDepartment(String departmentName) {
        departments.remove(departmentName);
    }

    /** Временный метод для наполнения библиотеки данными*/
    public void fillData() {
        addDepartments();
    }

    /** Временный метод для наполнения библиотеки данными*/
    private void addDepartments() {
        departments.put("художественный", addCasesToDepartment());
        departments.put("технический", addCasesToDepartment());
    }

    /** Временный метод для наполнения библиотеки данными*/
    private  LibraryDepartment addCasesToDepartment() {
        LibraryDepartment department = new LibraryDepartment();
        department.addCase(createCase());
        department.addCase(createCase());
        return department;
    }

    /** Временный метод для наполнения библиотеки данными*/
    private BookCase createCase() {
        BookCase bookCase = new BookCase();
        bookCase.addShelf("Пушкин А.С.", createShelf());
        bookCase.addShelf("Лермонтов М.Ю.", createShelf());
        return bookCase;
    }

    /** Временный метод для наполнения библиотеки данными*/
    private BookShelf createShelf() {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book(createInsert(), createCard1()));
        bookShelf.addBook(new Book(createInsert(), createCard2()));
        bookShelf.addBook(new Book(createInsert(), createCard2()));
        return bookShelf;
    }

    /** Временный метод для наполнения библиотеки данными*/
    private BookCard createCard1() {
        return new BookCard("Книга-1", "Отдел-1", "Полка-1", 4);
    }

    /** Временный метод для наполнения библиотеки данными*/
    private BookCard createCard2() {
        return new BookCard("Книга-2", "Отдел-2", "Полка-2", 4);
    }

    /** Временный метод для наполнения библиотеки данными*/
    private BookInsert createInsert() {
        return new BookInsert("10.06.2023", "deadline", "123-HG");
    }
}
