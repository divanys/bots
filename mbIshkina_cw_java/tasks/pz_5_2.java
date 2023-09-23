/*
* Вводится массив (сначала количество элементов, потом сами элементы).
* Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
*/
import java.util.Scanner;

public class pz_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int n = scanner.nextInt();
        int sum = 0;
        int [] mass = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }

        // Поиск суммы
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += mass[i];
            }
        }

        // Вывод суммы чисел с чётным индексом и их самих
        System.out.println("Сумма элементов с чётным индексом равна " + sum);
        System.out.println("Элементы с чётным индексом:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(mass[i] + " ");
            }
        }
    }
}

