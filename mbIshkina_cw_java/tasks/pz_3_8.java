import java.util.Scanner;

public class pz_3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        System.out.println("Введите число m:");
        int m = scanner.nextInt();
        System.out.println("Введите число k:");
        int k = scanner.nextInt();

        if (k < (n * m) && ((k % n == 0) || (k % m == 0)) || (n * m / 2 >= k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
