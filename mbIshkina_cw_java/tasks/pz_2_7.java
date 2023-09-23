import java.util.Scanner;

public class pz_2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Введите число: ");
            int chislo = scan.nextInt();
            int d = chislo % 10;
            System.out.println("otvet " + d);

    }
}
