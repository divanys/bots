import java.util.Scanner;

public class pz_4_1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int num;

        do {
            num = scanner.nextInt();

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        } while (num != 0);

        System.out.println("Второй по величине элемент: " + secondMax);
    }
}
