import java.io.*;
import java.nio.Buffer;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));
            String str;
            while ((str = reader.readLine()) != null) {
                int count = 0;
                int count_max = 0;
                for (char c : str.toCharArray()) {
                    if (Character.isDigit(c)) {
                        count += 1;
                    } else {
                        if (count > count_max) {
                            count_max = count;
                        }
                        count = 0;
                    }
                }
                writer.write(count_max + System.lineSeparator());
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи в файл");
            e.printStackTrace();
        }
    }
}