import java.util.Scanner;

public class pz_3_4 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int x = scan.nextInt();
        int w = h * 3600 + m * 60;
        int c = x * 3600;
        if (c <= w) {
            System.out.println("Успел!!!!!!!");
        } else {
            System.out.println("не успел!!!!!!!");
        }
    }
}
