import java.util.Scanner;

public class pz_1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int chislo = scan.nextInt();
        System.out.println("The next number for the number " + chislo + " is " + (chislo + 1));
        System.out.println("The previous number for the number " + chislo + " is " + (chislo - 1));

    }
}
