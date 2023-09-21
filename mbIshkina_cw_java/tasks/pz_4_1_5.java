import java.util.Scanner;

public class pz_3_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int number;

        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Максимальный элемент: " + maxNumber);
    }
}
