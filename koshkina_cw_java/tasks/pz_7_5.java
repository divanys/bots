import java.util.Scanner;

/*
Замена.
Вася написал книгу рецептов для своего лучшего друга Коли, но забыл, что у него аллергия на один из продуктов.
А что, если у человека есть аллергия не на один, а на несколько продуктов? да и держать книгу как одну большую строку
не очень удобно. Помимо всего прочего, непривычно видеть текст без заглавных букв.  Помогите Васе улучшить алгоритм.
На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
Потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится
m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт,
на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену,
не встречаются изначально в тексте.
*/

public class pz_7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRecipes = scanner.nextInt();
        scanner.nextLine();
        String[][] recipes = new String[numRecipes][];

        for (int i = 0; i < numRecipes; i++) {
            recipes[i] = scanner.nextLine().split(" ");
        }

        int numReplacements = scanner.nextInt();
        scanner.nextLine();
        String[][] replacements = new String[numReplacements][2];

        for (int i = 0; i < numReplacements; i++) {
            String[] replacementPair = scanner.nextLine().split(" – ");
            replacements[i][0] = replacementPair[0].toLowerCase();
            replacements[i][1] = replacementPair[1];
        }

        for (String[] recipe : recipes) {
            for (int i = 0; i < recipe.length; i++) {
                String word = recipe[i].toLowerCase();
                for (String[] replacement : replacements) {
                    if (word.equals(replacement[0]) || word.equalsIgnoreCase(replacement[0])) {
                        recipe[i] = replacement[1].substring(0, 1).toUpperCase() + replacement[1].substring(1);
                    }
                }
            }
            recipe[0] = recipe[0].substring(0, 1).toUpperCase() + recipe[0].substring(1);
        }

        for (int j = 0; j < recipes.length; j++) {
            for (int i = 0; i < recipes[j].length; i++) {
                System.out.print(recipes[j][i] + " ");
            }
            System.out.println();
        }
    }

}
/*
    Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
        Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
Ввод:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измельчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть, радоваться жизни.
3
арахис – колбаса
клубника – вишня
сгущенка – молоко
Вывод:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измельчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть, радоваться жизни.
 */