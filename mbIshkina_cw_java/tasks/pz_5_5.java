import java.util.Scanner;

public class pz_5_5 {
    public static void main(String[]args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите количество чисел: ");
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            System.out.println("Введите числа:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int[] occurrences = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (numbers[i] == numbers[j]) {
                        occurrences[i]++;
                    }
                }
            }

            System.out.println("Элементы, встречающиеся один раз:");
            for (int i = 0; i < n; i++) {
                if (occurrences[i] == 1) {
                    System.out.print(numbers[i] + " ");
            }
        }
    }
}

/*
Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Вводится количество чисел. Вводится список чисел.
Выведите ответ на задачу.
*/