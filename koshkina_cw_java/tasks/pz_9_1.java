import java.util.*;

public class pz_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько");
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> wordFrequency = new HashMap<>();
        System.out.println("что");

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine().toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("Самое частое слово: " + mostFrequentWord);
    }
}

/*
Что ты сказал?
Вводится натуральное число n, затем n слов на разных строках. Определите, какое слово встречается чаще всего.
Гарантируется, что такое слово одно. Все слова вводятся в нижнем регистре на русском языке.
*/

