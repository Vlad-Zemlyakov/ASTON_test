import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        }
        else {
            System.out.print("Нет такого имени");
        }
    }
}