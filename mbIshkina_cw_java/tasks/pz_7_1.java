import java.util.Scanner;

/*
Просто соедини их
Вводится число n, затем n строчек, которые необходимо соединить. После вводится ещё одна строка - ,
 которая должна быть в качестве разделителя. Выведите одну строку - все введённые выше слова через разделитель.
Например:
Ввод:			Вывод:
5			Привет-это- занятие -по-Java
Привет
это
занятие
по
Java
-
*/

public class pz_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести количество строк: ");
        int n = scanner.nextInt();
        System.out.println("Ввести данные: ");
        String[] mas = new String[n];
        for (int i = 0; i < n; i++) {
            mas[i] = scanner.next();
            }
        System.out.println("Ввести разделитель: ");
        String joinStr = scanner.next();
        System.out.print(String.join(joinStr, mas));
    }
}
