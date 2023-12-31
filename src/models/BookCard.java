package models;

/**
 * Класс Карточка
 * Хранит информацию о расположении книги и о количестве её экземпляров
 * Реализует гетеры полей класса
 */
public class BookCard {
    private String name; // Выходные данные
    private String libraryDepartment; // Отдел библиотеки
    private String bookShelf; // Полка на которой находится книга
    private int count;  // Количество экземпляров книги

    public BookCard(BookCardBuilder builder) {
        name = builder.name;
        libraryDepartment = builder.libraryDepartment;
        bookShelf = builder.bookShelf;
        count = builder.count;
    }

    public String getName() {
        return name;
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
        return "{" + name + " " + libraryDepartment + " " + bookShelf + "}";
    }

    public static class BookCardBuilder {
        private String name; // Выходные данные
        private String libraryDepartment; // Отдел библиотеки
        private String bookShelf; // Полка на которой находится книга
        private int count;  // Количество экземпляров книги

        public BookCardBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookCardBuilder setLibraryDepartment(String libraryDepartment) {
            this.libraryDepartment = libraryDepartment;
            return this;
        }

        public BookCardBuilder setBookShelf(String bookShelf) {
            this.bookShelf = bookShelf;
            return this;
        }

        public BookCardBuilder setCount(int count) {
            this.count = count;
            return this;
        }

        public BookCard build() {
            return new BookCard(this);
        }
    }
}
