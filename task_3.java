import java.util.ArrayList;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();
        ArrayList<Integer> SubArray = new ArrayList<>(size);
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            SubArray.add(scanner.nextInt());
        }
        System.out.print("Полученный массив: ");
        System.out.println(SubArray);
        int [] array = new int[SubArray.size()];
        for (int i = 0; i < size; i++) {
            array[i] = SubArray.get(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                result.add(array[i]);
            }
        }
        System.out.print("Элементы массива кратные трём: ");
        System.out.print(result);
    }
}