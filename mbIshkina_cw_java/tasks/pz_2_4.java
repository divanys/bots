import java.util.Scanner;

public class pz_2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину: ");
        int a = scan.nextInt();
        System.out.println("Введите ширину: ");
        int b = scan.nextInt();
        System.out.println("Площадь равна " + a * b);
        System.out.println("Периметр равен " + a * b * 2);

    }
}
