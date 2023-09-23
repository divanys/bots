import java.util.Scanner;

public class pz_4_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int num = n;

        while (num != 0) {
            sum += num;
            num--;
        }

        System.out.println("Сумма цифр до " + n + " равна " + sum);
    }
}
