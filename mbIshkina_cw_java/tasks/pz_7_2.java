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
        System.out.println("Ввести данные: ");
        String str1 = scanner.nextLine();
        System.out.println("Ввести число для задания: ");
        String str2 = scanner.next();
        System.out.println(str1.indexOf(str2) + " " + str1.lastIndexOf(str2));

    }
}
