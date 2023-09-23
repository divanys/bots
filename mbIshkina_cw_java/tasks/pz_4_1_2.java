import java.util.Scanner;

public class pz_4_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        int sum = 0;
        int i = a;
        while (i <= b) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от a до b: " + sum);
    }
}
