import java.util.Scanner;

public class pz_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] lst = new String[n];

        for (int i = 0; i < n; i++) {
            lst[i] = String.valueOf(i);
        }

        int m = scanner.nextInt();
        String s = scanner.next();

        lst[m] = s;

        for (String num : lst) {
            System.out.print(num + " ");
        }
    }
}
/*
Добавление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m. Выведите список на экран через пробел.
Ввод
5
2
Строка
Вывод
0 1 Строка 2 3 4

*/