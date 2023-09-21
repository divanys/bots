import java.util.Scanner;

public class pz_3_2_1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            System.out.println("nub");
        }
        System.out.println(sum);
    }
}
