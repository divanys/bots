/*
Вводятся 2 натуральных числа: n (кол-во строк) и m (кол-во столбцов). Затем вводится двумерный массив размером n * m. Поверните его на 90 градусов против часовой стрелке и выведите на экран (через пробел).
Пример.
Ввод:				        Вывод:
3 (n – кол-во строк)		8 8 4
4 (m – кол-во столбцов)	    3 7 3
1 2 3 8				        2 6 6
4 6 7 8				        1 4 -5
-5 6 3 4
*/
import java.util.Scanner;

public class pz_6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести количество строк: ");
        int n = scanner.nextInt();
        System.out.println("Ввести количество столбцов: ");
        int m = scanner.nextInt();
        int[][] mas = new int[n][m];
        System.out.println("Ввести данные: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = scanner.nextInt();
            }
        }
        int[][] mas_trans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas_trans[m-j-1][i] = mas[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas_trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
