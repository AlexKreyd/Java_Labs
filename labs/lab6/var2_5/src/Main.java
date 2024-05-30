import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = "input.txt";

        try {
            // Чтение всех строк из файла
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            if (lines.isEmpty()) {
                System.out.println("Файл пуст.");
                return;
            }

            // Парсинг чисел из первой строки файла
            String[] numbers = lines.get(0).split("\\s+");
            List<Integer> C1 = new ArrayList<>();
            List<Integer> C2 = new ArrayList<>();

            boolean firstSet = true;
            for (String numStr : numbers) {
                int num = Integer.parseInt(numStr);
                if (num < 0) {
                    firstSet = false; // Встретили отрицательное число, переключаемся на второй набор
                    continue;
                }
                if (firstSet) {
                    C1.add(num);
                } else {
                    C2.add(num);
                }
            }

            // Сортировка списков C1 и C2
            Collections.sort(C1);
            Collections.sort(C2);

            // Объединение списков C1 и C2 в один упорядоченный список
            List<Integer> mergedList = new ArrayList<>(C1);
            mergedList.addAll(C2);
            Collections.sort(mergedList);

            // Вывод результата
            System.out.println("C1 (отсортированный): " + C1);
            System.out.println("C2 (отсортированный): " + C2);
            System.out.println("Объединенный список: " + mergedList);

        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
