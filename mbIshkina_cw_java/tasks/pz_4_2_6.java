import java.util.Scanner;

public class pz_3_2_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = n; i >= 1; i = i / 2) {
            System.out.println(i % 2);
        }
    }
}
