package model;

/** Класс Клиент
 * Хранит информацию о клиенте
 * Реазлизует методы для получения / возврата книг и выплата штрафа*/

//TODO: Объединить библиотекаря и клиента в сущность "человек" для Proxy
public class Client {
    private String name; // Имя клиента
    private Book book; // Книга на руках
    private String ticketNumber; // Номер читательского

    public Client(String name, String ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }

    // Взять книгу
    public boolean takeBook(Book book) {
        if (this.book == null) this.book = book;
        else return false;
        return true;
    }

    // Вернуть книгу
    public Book returnBook() {
        return book;
    }

    // Выплатить штраф
    public void payFine() {

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", book=" + book +
                ", ticketNumber='" + ticketNumber + '\'' +
                '}';
    }
}
