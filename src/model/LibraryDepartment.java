package model;

import java.util.ArrayList;

public class LibraryDepartment {
    private ArrayList<BookCase> cases;

    public LibraryDepartment() {
        cases = new ArrayList<>();
    }

    public Book findShelfByAuthor(String author, String bookName) {
        for (BookCase bookCase : cases) {
            return bookCase.getBookShelves().get(author).findBook(bookName);
        }
        return null;
    }

    public boolean addCase(BookCase bookCase){
        return cases.add(bookCase);
    }

    public boolean removeCase(BookCase bookCase){
        return cases.remove(cases);
    }
}
