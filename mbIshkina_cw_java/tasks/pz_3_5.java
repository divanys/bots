import java.util.Scanner;

public class pz_2_5 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);
    }
}
