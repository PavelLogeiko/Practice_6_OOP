import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// чтение данных из файла формата csv (Book.csv)
// Так как файл Book.csv при старте программы - пустой, для корректной работы, сначала выполните запись в файл,
// через меню п.6, потом чтение из файла п.7
public class FileReader {
    public FileReader(Scanner scanner) {
    }

    public void fileReader (){
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("/Users/logeyko/IdeaProjects/Practice_6_OOP/src/Book.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecord(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Список контактов из файла Book.csv:\n");
        for (List<String>  list: records){
            System.out.print(String.format("№(ID): %s Фамилия / Наименование: %s Имя: %s Телефон: %s Приоритет: %s Комментарий: %s\n",
                    list.get(0),
                    list.get(1),
                    list.get(2),
                    list.get(3),
                    list.get(4),
                    list.get(5)));
        }
    }
    private List<String> getRecord(String line) {
        List<String> rows = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                rows.add(rowScanner.next());
            }
        }
        return rows;
    }
}
