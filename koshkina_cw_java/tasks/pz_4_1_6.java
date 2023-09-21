import java.util.Scanner;

public class pz_3_1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        int c = a;

        while (c <= b) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
            c++;
        }
    }
}
