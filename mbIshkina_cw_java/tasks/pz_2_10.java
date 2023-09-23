import java.util.Scanner;

public class pz_2_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите h: ");
        int h = scan.nextInt();
        System.out.println("Введите a: ");
        int a_a = scan.nextInt();
        System.out.println("Введите b: ");
        int b = scan.nextInt();
        int d = (h - b - 1) / (a_a - b) + 1;
        System.out.println("Приползёт она к вам через " + d + " дней...");
    }
}
