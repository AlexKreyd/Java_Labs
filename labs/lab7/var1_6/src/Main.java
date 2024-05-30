import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод исходного текста
        System.out.println("Введите исходный текст:");
        String text = scanner.nextLine();

        // Ввод подстроки
        System.out.println("Введите подстроку для поиска:");
        String substring = scanner.nextLine();

        // Ввод слова для вставки
        System.out.println("Введите слово для вставки:");
        String wordToInsert = scanner.nextLine();

        // Вставка слова после каждого слова, заканчивающегося на подстроку
        String result = insertAfterSubstring(text, substring, wordToInsert);

        // Вывод результата
        System.out.println("Результат:");
        System.out.println(result);
    }

    // Метод для вставки слова после каждого слова, заканчивающегося на заданную подстроку
    public static String insertAfterSubstring(String text, String substring, String wordToInsert) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word);
            // не учитываем запятую в конце слова, если она есть
            if (word.replace(",", "").endsWith(substring)) {
                result.append(" ").append(wordToInsert);
            }
            result.append(" ");
        }

        // Удаление последнего пробела
        return result.toString().trim();
    }
}
