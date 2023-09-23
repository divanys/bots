import java.util.Scanner;

public class pz_3_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        if (k < (n * m) && ((k % n == 0) || (k % m == 0))) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
    }
}
