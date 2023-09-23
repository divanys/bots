import java.util.Scanner;
/*
Кто первый?
Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра.
Определите индексы первого и последнего её вхождения.
Ввод:					                    Вывод:
4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7		    0
4					                        28


*/

public class pz_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веддите данные: ");
        String data = scanner.nextLine();
        System.out.println("Введите число для задания: ");
        String number = scanner.next();
        System.out.println("Цифра " + number + " имеет первое вхождение с индексом " + data.indexOf(number) +
                " и последнее с индексом " + data.lastIndexOf(number));
    }
}
