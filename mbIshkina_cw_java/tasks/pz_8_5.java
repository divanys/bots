import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pz_8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество запросов: ");
        int n = scanner.nextInt();


        List<String> stack = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String query = scanner.next();
            if (query.equals("push")) {
                String item = scanner.next();
                stack.add(item);
            } else if (query.equals("pop")) {
                if (!stack.isEmpty()) {
                    String item = stack.remove(stack.size() - 1);
                    System.out.println("Петя взял " + item);
                }
            }
        }

        System.out.println("Оставшиеся вещи на стуле:");
        System.out.println(String.join(" ", stack));

    }
}

/*
Стек.
Напишите программу, которая реализует структуру данных стек, используя список.
Условие задачи таково: мальчик Петя использует свой стул в качестве многоместной вешалки. А именно: накидывает на него
вещи. Иногда он забирает верхнюю вещь. Нужно вывести на экран порядок его вещей от спинки стула.
*/