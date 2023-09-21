import java.util.Scanner;

public class pz_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}