import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод стихотворения
        List<String> poem = new ArrayList<>();
        System.out.println("Введите стихотворение:");
        String line = scanner.nextLine();;
        while(!line.isEmpty()) {
            poem.add(line);
            line = scanner.nextLine();
        }
        scanner.nextLine();

        // Подсчет слов, начинающихся и заканчивающихся гласной буквой
        int count = 0;
        for (String l : poem) {
            count += countVowelWords(l);
        }

        // Вывод результата
        System.out.println("Количество слов, начинающихся и заканчивающихся гласной буквой: " + count);
    }

    // Метод для подсчета слов, начинающихся и заканчивающихся гласной буквой
    public static int countVowelWords(String text) {
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (isVowelWord(word)) {
                count++;
            }
        }

        return count;
    }

    // Метод для проверки, начинается и заканчивается ли слово гласной буквой
    public static boolean isVowelWord(String word) {
        if (word.isEmpty()) {
            return false;
        }

        // Преобразуем слово в нижний регистр для упрощения сравнения
        word = word.toLowerCase();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        return isVowel(firstChar) && isVowel(lastChar);
    }

    // Метод для проверки, является ли символ гласной буквой
    public static boolean isVowel(char c) {
        return "ауоыиэяюёеaeiuyj".indexOf(c) != -1;
    }
}
