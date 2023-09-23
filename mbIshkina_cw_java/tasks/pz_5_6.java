import java.util.Scanner;

public class pz_5_6 {
    public static void main(String[]args) {

        Scanner cs = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = cs.nextInt();
        int[] numbers = new int[n];

        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = cs.nextInt();
        }

        for (int i = 0; i < n - 1; i += 2) {
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }

        System.out.println("Список после перестановки соседних элементов:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
/*
Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.).
Если элементов нечетное число, то последний элемент остается на своем месте.
Вводится количество чисел. Вводится список чисел.
*/