import java.util.Scanner;


public class pz_3_13 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int t;

        if (k == 0 || m == 0 || n == 0) {
            t = 0;
        } else if (n <= k) {
            t = m * 2;
        } else {
            t = ((n * 2) / k) * m;
        }
        System.out.println("Время подготовки " + t);

    }
}
