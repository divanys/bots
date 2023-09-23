import java.util.Scanner;

public class pz_4_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        int count = 0;
        int i = a;
        while (i <= b) {
            if (i % 3 == 0 && i % 5 != 0) {
                count++;
            }
            i++;
        }

        System.out.println("Количество чисел, кратных 3, но не кратных 5: " + count);
    }
}
