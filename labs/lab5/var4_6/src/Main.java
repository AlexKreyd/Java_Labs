import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Необходимо передать только 1 параметр - путь к входному файлу");
            return;
        }

        // путь входного файла
        String inputFile = args[0];
        List<String> lines = readFile(inputFile);

        // проверка на содержимое файла
        if (lines == null) {
            System.out.println("Error reading file.");
            return;
        }

        // убираем лишние слова из каждой строки
        List<String> modifiedLines = new ArrayList<>();
        for (String line : lines) {
            modifiedLines.add(removeWords(line));
        }

        // Cоздаем новую директорию и файл в ней для вывода
        String outputDirName = "output";
        File outputDir = new File(outputDirName);
        if (!outputDir.exists()) {
            outputDir.mkdir();
        }

        String outputFileName = outputDirName + "/modified_data.txt";
        File outputFile = new File(outputFileName);

        writeFile(outputFile, modifiedLines);
        System.out.println("Модифицированные данные записаны в " + outputFileName);
    }

    private static List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return lines;
    }

    private static String removeWords(String line) {
        String[] words = line.split("\\s+");
        // target - слова длиной от 3 до 5 символов
        List<String> targetWords = new ArrayList<>();
        List<String> nonTargetWords = new ArrayList<>();

        // поиск таргетных слов
        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 5) {
                targetWords.add(word);
            } else {
                nonTargetWords.add(word);
            }
        }

        // поиск ближайшего четного числа таргетных слов
        int toRemove = targetWords.size();
        if (toRemove % 2 != 0) {
            toRemove--; // Reduce to even number
        }

        // удаляем слова максимальные по длине
        targetWords.sort(Comparator.comparingInt(String::length).reversed());
        for (int i = 0; i < toRemove; i++) {
            targetWords.remove(0);
        }

        List<String> resultWords = new ArrayList<>(nonTargetWords);
        resultWords.addAll(targetWords);

        return String.join(" ", resultWords);
    }

    private static void writeFile(File file, List<String> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
