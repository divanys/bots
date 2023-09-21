import java.util.*;

public class pz_9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько игроков");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("количество букав");
        int k = scanner.nextInt();
        scanner.nextLine();

        Map<String, Set<String>> childrenWords = new HashMap<>();
        System.out.println("кто: что");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(":");
            String name = parts[0].trim();
            String[] words = parts[1].toLowerCase().split("\\s+");

            Set<String> uniqueWords = new HashSet<>();
            for (String word : words) {
                if (word.length() >= k) {
                    uniqueWords.add(word);
                }
            }

            childrenWords.put(name.toLowerCase(), uniqueWords);
        }

        String winner = null;
        int maxWords = 0;

        for (Map.Entry<String, Set<String>> entry : childrenWords.entrySet()) {
            if (entry.getValue().size() > maxWords) {
                maxWords = entry.getValue().size();
                winner = entry.getKey();
            }
        }

        System.out.println(winner.substring(0, 1).toUpperCase() + winner.substring(1) + ": " + maxWords);
    }
}
/*
Словари и множества
Несколько друзей решили сыграть в игру: кто больше слов знает. Они сели за стол и стали записывать все слова, которые
только пришли им на ум. После чего стали сравнивать, у кого больше слов. В этот момент стало понятно, что некоторые
ребята по ошибке записали какие-то слова несколько раз. Разумеется, повторяющиеся слова вычеркнули. Потом они поняли,
что слов слишком много, поэтому решили считать только те, длина которых не меньше, чем K. Помогите ребятам узнать,
кто же знает больше слов. Гарантируется, что есть единственный победитель.
Сначала вводится число n - количество ребят. Затем идёт n строк вида:
"Имя ребёнка: слово1 слово2 слово3 и т.д."
После чего вводится число K.
Выведите на экран имя ребёнка и количество слов, которое он знает (они не должны повторяться,
и их длина должна быть не меньше К).
Учтите, что некоторые слова дети могут написать в разных регистрах. Например, слова "Слово" и
"слово" — это одно и то же.
*/