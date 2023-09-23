import java.util.Scanner;
/*
Создание списка.
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и последний
элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.
Ввод            Вывод
3               xxxxx
yyyy            1 0 0 0 1
*/
public class pz_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чиселку: ");
        int n = scanner.nextInt();

        int[] lst = new int[n+2];
        lst[0] = 1;
        lst[n+1] = 1;
        for (int i = 1; i <= n; i++) {
                lst[i] = 0;
            }

        for (int num : lst) {
            System.out.print(num + " ");
            }
    }
}