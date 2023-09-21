import java.util.Scanner;

public class pz_3_2_4 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
        }
        System.out.println(mul);
    }
}
