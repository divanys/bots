import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pz_8_4 {
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

        numbers.remove(m);

        System.out.println("Обновленный список чисел:");
        System.out.println(String.join(" ", numbers));
    }
}

/*
Удаление элемента.
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится
cтроковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n). Удалите элемент на позиции m.
Выведите список на экран через пробел.
Ввод
5
2
Вывод
0 1 3 4
*/