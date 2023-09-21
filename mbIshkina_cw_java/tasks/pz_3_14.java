import java.util.Scanner;


public class pz_2_14 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a >= b && a >= c && b >= c) {
            System.out.println(c + " " + b + " " + a);
        } else if (a <= b && a >= c && b >= c) {
            System.out.println(c + " " + a + " " + b);
        } else if (a <= b && a <= c && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= b && a >= c && b <= c) {
            System.out.println(b + " " + c + " " + a);
        } else if (a >= b && a <= c && b <= c) {
            System.out.println(b + " " + a + " " + c);
        } else {
            System.out.println(a + " " + c + " " + b);
        }
    }
}
