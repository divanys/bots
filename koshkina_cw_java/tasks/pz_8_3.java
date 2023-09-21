import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pz_8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(String.valueOf(i));
        }

        System.out.println("Список чисел:");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Введите число m (m < n): ");
        int m = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите строку s: ");
        String s = scanner.nextLine();

        numbers.set(m, s);

        System.out.println("Обновленный список чисел:");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}

/*
Замена элемента.
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится
строковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n) и строку s. Замените строкой s
элемент на позиции m. Выведите список на экран через пробел.

*/