import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // ввод заданного списка слов
        HashMap<String, Integer> words_freq = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова для анализа частоты в нижнем регистре черел пробел");
        String[] words = scanner.nextLine().split(" ");
        for (String w: words) {
            words_freq.put(w, 0);

        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));

            // построчное чтение файла
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word: line.toLowerCase().split(" ")) {
                    if (words_freq.get(word) != null) {
                        words_freq.put(word, words_freq.get(word) + 1);
                    }
                }
            }

            // сортируем по значениям частоты слов
            TreeMap<Integer, String> sorted_words = new TreeMap<>();
            for(Map.Entry<String, Integer> w: words_freq.entrySet()) {
                sorted_words.put(w.getValue(), w.getKey());
            }

            // вывод слов и их частот в отсортированном виде и запись в файл
            for(Map.Entry<Integer, String> w: sorted_words.entrySet()) {
                System.out.println(w.getValue() + " " + w.getKey());
                writer.write(w.getValue() + " " + w.getKey() + System.lineSeparator());
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи в файл");
            e.printStackTrace();
        }
    }
}