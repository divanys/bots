import java.util.Scanner;

public class pz_2_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите v: ");
        int v = scan.nextInt();
        System.out.println("Введите t: ");
        int t = scan.nextInt();
        int c = v * t % 109;
        int d = (c + 109) % 109;
        System.out.println(d);
    }
}
