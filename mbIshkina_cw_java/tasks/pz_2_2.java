import java.util.Scanner;

public class pz_2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время движения: ");
        int t = scan.nextInt();
        System.out.println("Введите скорость движения: ");
        int s = scan.nextInt();
        System.out.println("Путь: " + t * s);
    }
}
