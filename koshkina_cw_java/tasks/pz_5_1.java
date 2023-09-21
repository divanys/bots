import java.util.Scanner;

public class pz_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Числа в обратном порядке:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
