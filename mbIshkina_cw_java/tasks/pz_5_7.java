import java.util.Scanner;

public class pz_4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        int[] cubes = new int[b - a + 1];

        for (int i = 0; i <= b - a; i++) {
            cubes[i] = (a + i) * (a + i) * (a + i);
        }
        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num >= a && num <= b) {
                int index = num - a;
                System.out.println("Куб числа " + num + ": " + cubes[index]);
            } else {
                System.out.println("Error");
            }
        }
    }
}

/*
Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b.
Затем вводится число n и n чисел после него. Используя данные из массива найдите кубы этих.
Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".
*/