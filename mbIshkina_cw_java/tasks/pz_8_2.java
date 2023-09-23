import java.util.ArrayList;
import java.util.Scanner;

public class pz_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scanner.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("Введите m (m <= n): ");
        int m = scanner.nextInt();
        System.out.println("Введите строчечку: ");
        String s = scanner.next();

        list.add(m, s);

        System.out.println("Вывод");
        System.out.println(String.join(" ", list));  // 0 1 Строка 2 3 4
    }
}
/*
Добавление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится
строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на
позицию m. Выведите список на экран через пробел.
Ввод
5
2
Строка
Вывод
0 1 Строка 2 3 4

*/