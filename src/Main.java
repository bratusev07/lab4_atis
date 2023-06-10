import model.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Центральная городская публичная библиотека им. А. П. Чехова", "Греческая ул., 105");
        library.fillData();

        Librarian librarian = new Librarian("Иван", "01.02.2000", 4);

        Client client = new Client("Петька", "123-GH");
        client.takeBook(librarian.giveBook(library, "художественный", "Пушкин А.С.", "Книга-1"));

        System.out.println(client);

        // Proxy - для прямого доступа к книгам
        // Builder - для создания отдела
        // Observer - для отслеживания книг
    }
}