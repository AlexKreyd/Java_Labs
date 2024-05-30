import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Исходный текст
        String text = "Вывести в заданном тексте все слова, расположив их в алфавитном порядке.";

        // Разбиваем текст на слова
        String[] words = text.split("\\s+");

        // Сортируем слова в алфавитном порядке с учетом регистра
        Arrays.sort(words, Comparator.comparing(String::toLowerCase));

        // Выводим отсортированные слова
        System.out.println("Слова в алфавитном порядке:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
