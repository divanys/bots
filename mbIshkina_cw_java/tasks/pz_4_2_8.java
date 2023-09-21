import java.util.Scanner;

public class pz_3_2_8 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int max = x;
        int len = 0;
        for (; x != 0; x = scan.nextInt()) {
            if (x > max) {
                max = x;
                len = 1;
            } else if (x == max) {
                len += 1;
            }
        }
        System.out.println(len);
    }
}

