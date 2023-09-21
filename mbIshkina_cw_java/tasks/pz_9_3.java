import java.util.*;

public class pz_9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько");
        int n = scanner.nextInt();

        Set<Integer> seenNumbers = new HashSet<>();
        System.out.println("что");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (seenNumbers.contains(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                seenNumbers.add(num);
            }
        }
    }
}

/*
Встречалось ли число раньше?
Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке),
если это число ранее встречалось в последовательности или NO,  если не встречалось.
*/