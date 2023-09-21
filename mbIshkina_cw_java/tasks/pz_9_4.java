import java.util.*;

public class pz_9_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько");
        int numLines = scanner.nextInt();
        scanner.nextLine();

        Set<String> uniqueWords = new HashSet<>();
        System.out.println("что");

        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");

            for (String word : words) {
                uniqueWords.add(word);
            }
        }

        System.out.println("Количество различных слов: " + uniqueWords.size());
    }
}
/*
Количество слов
Дан текст: в первой строке записано число строк, далее идут сами строки. Определите, сколько различных слов
содержится в этом тексте.
Словом считается последовательность непробельных символов идущих подряд, слова разделены одним или большим
числом пробелов или символами конца строки.

*/