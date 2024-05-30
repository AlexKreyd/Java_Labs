import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Пример набора точек
        List<Point> points = List.of(
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3),
                new Point(4, 4),
                new Point(1, 2),
                new Point(2, 4),
                new Point(3, 6)
        );

        // Вызываем метод для нахождения всех прямых
        findLines(points, "output.txt");
    }

    public static void findLines(List<Point> points, String outputFilePath) {
        // Карта для хранения описания прямых и количества точек на каждой прямой
        HashMap<Line, Integer> linesMap = new HashMap<>();

        // Находим все прямые, проходящие через более чем одну точку
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Line line = new Line(points.get(i), points.get(j));
                linesMap.put(line, linesMap.getOrDefault(line, 0) + 1);
            }
        }

        // Фильтрация прямых, проходящих через более чем одну точку
        linesMap.entrySet().removeIf(entry -> entry.getValue() <= 1);

        // Запись результатов в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (Map.Entry<Line, Integer> entry : linesMap.entrySet()) {
                Line line = entry.getKey();
                int count = entry.getValue();
                writer.write(String.format("Прямая: %s, Количество точек: %d%n", line, count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


