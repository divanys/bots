import java.util.Scanner;

public class pz_3_12 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = a % 10;

        if (a == 1 || (n == 1 && a != 11)) {
            System.out.println("на лугу пасётся " + a + "корова");
        } else if (n >= 2 && n < 5) {
            System.out.println("на лугу пасётся " + a + "коровы");
        } else {
            System.out.println("на лугу пасётся " + a + "коров");
        }
    }
}
