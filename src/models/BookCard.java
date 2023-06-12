package models;

/**
 * Класс Карточка
 * Хранит информацию о расположении книги и о количестве её экземпляров
 * Реализует гетеры полей класса
 */
public class BookCard {
    private String data; // Выходные данные
    private String libraryDepartment; // Отдел библиотеки
    private String bookShelf; // Полка на которой находится книга
    private int count;  // Количество экземпляров книги

    public BookCard(BookCardBuilder builder) {
        data = builder.data;
        libraryDepartment = builder.libraryDepartment;
        bookShelf = builder.bookShelf;
        count = builder.count;
    }

    @Override
    public String toString() {
        return "{" + data + " " + libraryDepartment + " " + bookShelf + "}";
    }

    public static class BookCardBuilder {
        private String data; // Выходные данные
        private String libraryDepartment; // Отдел библиотеки
        private String bookShelf; // Полка на которой находится книга
        private int count;  // Количество экземпляров книги

        public BookCardBuilder setData(String data) {
            this.data = data;
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
