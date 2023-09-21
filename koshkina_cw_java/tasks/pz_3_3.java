import java.util.Scanner;

public class pz_2_3 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        if (a / 2 > 10) {
            System.out.println(a - 10);
        } else {
            System.out.println(a / 2);
        };
    }
}
