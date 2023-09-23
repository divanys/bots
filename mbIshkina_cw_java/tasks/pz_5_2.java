/*
* Вводится массив (сначала количество элементов, потом сами элементы).
* Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
*/
import java.util.Scanner;

public class pz_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int n = sc.nextInt();
        int sum = 0;
        int [] a = new int[n];

        System.out.println("Введите элементы массива (через Enter):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println("sum is " + sum);
        for (int i = 0; i < n; i++){
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

