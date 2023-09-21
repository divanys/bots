import java.util.Scanner;

/*
IP-адрес.
IP-адрес состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками.
 В следующих трех строках показаны три правильных IP-адреса:
127.0.0.0
192.168.0.01
255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.
Для корректного создания строки, содержащей точку, используйте экранирование: String s = "\\.";
Ввод:				Вывод:
192.168.1.2			YES

*/

public class pz_7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести строку: ");
        String str3 = scanner.nextLine().toLowerCase();
        String mas[] = str3.split("\\.");
        boolean y_r_n = true;

        for (int i = 0; i < mas.length; i++) {
            if (Integer.parseInt(mas[i]) >= 255 || Integer.parseInt(mas[i]) <= 0 || str3.length() >= 15) {
                y_r_n = false;
                break;
            }
        }
        System.out.println((y_r_n) ? "YES" : "NO");

    }
}
