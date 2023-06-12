import models.Book;

import java.util.ArrayList;

public interface Observer {
    void update(ArrayList<Book> books);
}
