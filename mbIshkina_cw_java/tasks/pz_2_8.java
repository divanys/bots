import java.util.Scanner;

public class pz_2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трёхзначное число: ");
        int digit = sc.nextInt();
        System.out.println("Сумма этого числа равна " + ((digit % 10) + (digit / 100) + (digit / 10 % 10)));
    }
}
