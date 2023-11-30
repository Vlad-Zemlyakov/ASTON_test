import java.io.IOException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7) System.out.print("Привет");
        else System.out.print("Введенное число меньше 7");
    }
}