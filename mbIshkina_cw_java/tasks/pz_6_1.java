import java.util.Scanner;

/*
Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения размером n*m через пробел.
Например.
Ввод:			         Вывод:
3 (кол-во строк)	     1 2 3 4
4 (кол-во столбцов)	     2 4 6 8
 			             3 6 9 12
*/
public class pz_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести количество строк: ");
        int n = scanner.nextInt();
        System.out.println("Ввести количество столбцов: ");
        int m = scanner.nextInt();
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
