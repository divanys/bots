import java.util.Scanner;

public class pz_3_11 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a + b) > c) {
            System.out.println("Существует");
        } else {
            System.out.println("не существует");
        }
    }
}
