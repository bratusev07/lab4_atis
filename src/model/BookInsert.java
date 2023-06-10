package model;

/** Класс Вкладыш
 * Хранит инфомрацию о дате выдач книги, сроке и номер читательского
 * Реализует гетеры и сетеры для полей */
public class BookInsert {
    private String date; // Дата выдачи книги
    private String deadline; // Срок выдачи книги
    private String ticketNumber; // Номер читательского билета

    public BookInsert(String date, String deadline, String ticketNumber) {
        this.date = date;
        this.deadline = deadline;
        this.ticketNumber = ticketNumber;
    }

    public String getDate() {
        return date;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return "BookInsert{" + date + " " + deadline + " " + ticketNumber + '}';
    }
}
