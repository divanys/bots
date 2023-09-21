import java.util.Scanner;

public class pz_3_1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите натуральное число n : ");
        int n = scanner.nextInt();

        int sum = 0;
        int num = n;

        while (num != 0) {
            sum += num %10;
            num /= 10;

        }

        System.out.println("Сумма ряда " + n + " равна " + sum);
    }
}

