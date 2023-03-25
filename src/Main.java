import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nВы находитесь в приложении Телефонный справочник <PhoneBook>, которое поможет " +
                "Вам организовать хранение и управление контактами.\n");
        Controller.run();
    }
}