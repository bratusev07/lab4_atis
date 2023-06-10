package model;

/** Класс библиотекарь
 * Хранит информацию о сотруднике
 * Реализует методы получения / возврата книг,
 *  выписывание штрафа и списание книги*/

//TODO: Объединить библиотекаря и клиента в сущность "человек" для Proxy
public class Librarian {
    private String name; // Имя библиотекаря
    private String birthday; // День рождения
    private int experience; // Опыт работы

    public Librarian(String name, String birthday, int experience) {
        this.name = name;
        this.birthday = birthday;
        this.experience = experience;
    }

    // Вернуть книгу
    public void takeBook(){}

    // Выдать книгу
    public Book giveBook(Library library, String dep, String auth, String name){
        Book book = library.getBook(dep, auth, name);
        if(book == null) System.out.println("Книга не найдена");
        return book;
    }

    // Списать книгу
    public void writeOffBook(){}

    // Выписать штраф
    public void issueFine(){}
}
