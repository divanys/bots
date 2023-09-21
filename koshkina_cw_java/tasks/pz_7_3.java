import java.util.Scanner;

/*
Сколько слов?
Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова, которые начинаются на
её любимую букву и заканчиваются на любимую букву её друга Олега. Олег же наоборот - слова,
которые начинаются на его любимую букву и заканчиваются на любимую букву Маши. Обратите внимание,
что буквы могут быть в разных регистрах (большие/маленькие).  Определите, сколько слов выписали дети.

На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова,
которые написаны в газете.

На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
Ввод:									Вывод:
а									2
в									3
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда


*/

public class pz_7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести первую букву: ");
        String str1 = scanner.nextLine();
        System.out.println("Ввести вторую букву: ");
        String str2 = scanner.nextLine();
        System.out.println("Ввести строку: ");
        String str3 = scanner.nextLine().toLowerCase();
        String mas[] = str3.split(" ");
        int m = 0;
        int o = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i].startsWith(str1) && mas[i].endsWith(str2)) {
                m++;
            } else if (mas[i].startsWith(str2) && mas[i].endsWith(str1)) {
                o++;
            }
        }
        System.out.println("Маша " + m + " " + "Олег " + o);

    }
}
