import java.util.Scanner;

public class pz_2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        double n = scan.nextInt();
        System.out.println("Число равно " + (n + ((n + 1) % 2 + 1)));
    }
}
