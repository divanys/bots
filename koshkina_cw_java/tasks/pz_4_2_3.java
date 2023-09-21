import java.util.Scanner;

public class pz_3_2_3 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int max, min, b;
        b = scan.nextInt();
        min = max = b;
        for (int i = 1; i < a; i++) {
            b = scan.nextInt();
            if (b < min) {
                min = b;
            }
            if (b > max) {
                max = b;
            }
        }
        System.out.println("Min " + min + " \n" + "Max " + max);
    }
}
