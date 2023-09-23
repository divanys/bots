import java.util.Scanner;

public class pz_2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        double b = scan.nextInt();
        int n = scan.nextInt();
        double cost = n * (100 * a + b);
        int d = (int) (cost / 100);
        System.out.println(d + " " + cost % 100);
    }
}
