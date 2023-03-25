import java.util.Scanner;
public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    // основное меню выбора действий с задачами в <PhoneBook>
    public String selectFunction() {
        System.out.print("""
                --------------------------------------
                ГЛАВНОЕ МЕНЮ телефонного справочника <PhoneBook> - выберите действие (введите цифру и нажмите Enter):
                --------------------------------------
                1. Показать все контакты
                2. Найти контакт по Фамилии / наименованию Организации
                3. Найти контакт по номеру телефона
                4. Найти контакт по ключевому слову в комментарии (например родство, профессия и пр.)
                5. Отсортировать контакты по избранным
                6. Выполнить запись контактов в файл
                7. Выполнить чтение контактов из файла формат <CSV> (Book.csv)
                8. Добавить новый контакт в справочник
                9. Удалить контакт из справочника из файла <CSV> (Book.csv)
                10. Изменить существующий контакт
                --------------------------------------
                0. Выход (завершение программы)
                """);
        return scanner.nextLine();
    }

    // подменю записи контактов в файл
    public String selectSaveType() {
        System.out.print("""
                --------------------------------------
                МЕНЮ записи контактов <PhoneBook> в файл - выберите действие (введите цифру и нажмите Enter):
                --------------------------------------
                1. Запись контактов в файл формата <CSV>
                2. Запись контактов в файл формата <JSON>
                3. Запись контактов в файл формата <XML>
                4. Вернуться в главное меню <PhoneBook>
                --------------------------------------
                0. Выход (завершение программы)
                """);
        return scanner.nextLine();

    }
    // подменю выбора действий, для изменения контактов
    public String selectContactChange() {
        System.out.print("""
                
                --------------------------------------
                МЕНЮ изменения контактов <PhoneBook> - выберите действие (введите цифру и нажмите Enter):
                --------------------------------------
                Выберите, что вы хотите изменить в контакте:
                1. Фамилию
                2. Имя
                3. Номер телефона
                4. Маркер избранный / обычный
                5. Комментарий (дополнительная информация о контакте)
                --------------------------------------
                6. Вернуться в главное меню <PhoneBook>
                --------------------------------------
                0. Выход (завершение программы)
                """);
        return scanner.nextLine();
    }
}