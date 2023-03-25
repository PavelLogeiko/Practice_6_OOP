import java.io.*;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;

// класс удаления контакта из файла Book.csv
public class DelContact {

    public DelContact(Scanner scanner) {
    }
    public void delContact (Contact byLastName) throws IOException {
        String outputLine = byLastName.getPersonLastName(); // берем в строку поиска Фамилию контакта введенного пользователем
        String line = null;
        File sourceFile = new File("/Users/logeyko/IdeaProjects/Practice_6_OOP/src/Book.csv");
        File outputFile = new File("/Users/logeyko/IdeaProjects/Practice_6_OOP/src/Book1.csv");

        BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        while ((line = reader.readLine()) != null) { // читаем файл Book.csv
            if (!line.contains(outputLine)) { // записывам в новый файл Book1.csv все контакты кроме Фамилии, которую хотим удалить
                writer.write(line);
                writer.newLine();
            }
        }
        reader.close(); // закрываем чтение
        writer.close(); // закрываем запись
        sourceFile.delete(); // удаляем первоначальный файл Book.csv
        outputFile.renameTo(sourceFile); // переименовываем файл Book1.csv в в Book.csv
        System.out.println("\nИз файла Book.csv успешно удален следующий контакт\n");
        System.out.println(byLastName); // выводим на консоль удаленную строку
        System.out.println("");
    }
}