import java.util.Scanner;

public class pz_4_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int num = scanner.nextInt();

        int i = 1;
        while (i * i <= num) {
            System.out.println(i * i);
            i++;
        }
    }
}
