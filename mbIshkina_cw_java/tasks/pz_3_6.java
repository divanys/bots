import java.util.Scanner;

public class pz_2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите year: ");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }
    }
}
