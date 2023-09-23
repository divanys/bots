import java.util.Scanner;

public class pz_2_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int chislo = scan.nextInt();
        int d = chislo % 10;
        int c = chislo / 100;
        int b = chislo / 10 % 10;
        System.out.println(d + c + b);
    }
}
