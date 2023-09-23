import java.util.*;

public class pz_9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сотрудников: ");
        int n = scanner.nextInt();
        int maxCount = 0;
        String popularProfession = null;
        scanner.nextLine();
        Map<String, Integer> professionCount = new HashMap<>();
        Map<String, List<String>> professionEmployees = new HashMap<>();
        System.out.println("Введите данные сотрудников в виде: Имя<Enter>Профессия: ");

        for (int i = 0; i < 2 * n; i += 2) {
            String name = scanner.nextLine();
            String profession = scanner.nextLine();
            professionCount.put(profession, professionCount.getOrDefault(profession, 0) + 1);

            List<String> employees = professionEmployees.getOrDefault(profession, new ArrayList<>());
            employees.add(name);
            professionEmployees.put(profession, employees);
        }

        for (Map.Entry<String, Integer> entry : professionCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                popularProfession = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Количество сотрудников с самой популярной профессией " + popularProfession + ": " + maxCount);
        System.out.println("Имена сотрудников с этой профессией:");
        List<String> employees = professionEmployees.get(popularProfession);
        System.out.println(String.join(" ", employees));
    }
}

/*
Статистика по Персоналу
Вводится число n. Затем 2*n строк. Каждая пара строк - имя человека и его профессия.
Определите, сотрудников какой профессии больше всего. Выведите на экран это количество, профессию и их имена на экран
 в том же порядке, в котором они вводились. Гарантируется, что будет введено не более 100 сотрудников.

*/