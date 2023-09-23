import java.util.Scanner;

public class pz_4_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number = 0;

        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое: " + average);
    }
}
