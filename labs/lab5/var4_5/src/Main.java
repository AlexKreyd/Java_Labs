import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Больше двух аргументов");
            return;
        }

        // определение пути входного файла и типа данных для фильтрации
        String inputFile = args[0];
        String dataType = args[1];
        List<String> data = readFile(inputFile);

        if (data == null) {
            System.out.println("Error reading file.");
            return;
        }

        // Фильтр данных по типу
        List<String> filteredData = filterDataByType(data, dataType);

        // Создание директории и файла для вывода результатов
        String outputDirName = "output";
        File outputDir = new File(outputDirName);
        if (!outputDir.exists()) {
            Boolean result = outputDir.mkdir();
        }

        String outputFileName = outputDirName + "/filtered_data.txt";
        File outputFile = new File(outputFileName);

        writeFile(outputFile, filteredData);
        System.out.println("Результат фильтрации записан в " + outputFileName);
    }

    private static List<String> readFile(String fileName) {
        List<String> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.addAll(Arrays.asList(line.split("\\s+")));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }

    private static List<String> filterDataByType(List<String> data, String dataType) {
        List<String> filteredData = new ArrayList<>();
        Pattern pattern;
        // фильтрация данных с помощью регулярных выражений
        switch (dataType.toLowerCase()) {
            case "integer":
                pattern = Pattern.compile("^\\d+$");
                break;
            case "float":
                pattern = Pattern.compile("^[+-]?\\d*\\.\\d+$");
                break;
            case "word":
                pattern = Pattern.compile("^[a-zA-Z]+$");
                break;
            case "symbol":
                pattern = Pattern.compile("^.$");
                break;
            default:
                System.out.println("Незнакомый тип данных: " + dataType);
                return filteredData;
        }

        for (String item : data) {
            if (pattern.matcher(item).matches()) {
                filteredData.add(item);
            }
        }

        return filteredData;
    }

    private static void writeFile(File file, List<String> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String item : data) {
                writer.write(item);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
