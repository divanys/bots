import java.util.Scanner;

public class pz_4_1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число a не меньше 2: ");
        int a = scanner.nextInt();


        int b = 2;

        while (a % b != 0) {
            b++ ;
        }

        System.out.println("Наименьший натуральный делитель числа " + a + ", отличный от 1, равен " + b);

    }
}
