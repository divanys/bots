import java.util.Scanner;

public class pz_4_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите натуральное число n : ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i *i;
            i++;
        }

        System.out.println("Сумма квадрата от 1 до " + n + " равна " + sum);


    }
}
