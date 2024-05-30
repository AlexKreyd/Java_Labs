import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String text = "Слово, еще одно слово";

        // Разбиваем текст на слова
        String[] words = text.split("\\s+");

        // Создаем множество для хранения уникальных слов, удовлетворяющих условию
        HashSet<String> uniqueWords = new HashSet<>();

        // Перебираем каждое слово из текста
        for (String word : words) {
            // Проверяем условие: первая и последняя буквы совпадают
            if (word.length() > 0 && word.charAt(0) == word.charAt(word.length() - 1)) {
                // Добавляем слово в множество, если оно уникально
                uniqueWords.add(word);
            }
        }

        // Выводим уникальные слова
        System.out.println("Уникальные слова с совпадающими первой и последней буквами:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}
