import models.Book;

import java.util.ArrayList;

public class People implements Observer{
    private String name;
    private Book book;
    private String ticketNumber;

    public People(String name, Book book, String ticketNumber) {
        this.name = name;
        this.book = book;
        this.ticketNumber = ticketNumber;
    }

    @Override
    public void update(ArrayList<Book> books) {
        System.out.println("Dear " + name + ", we have some changes in library");
    }
}
