import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод исходного текста
        System.out.println("Введите исходный текст:");
        String text = scanner.nextLine();

        // Ввод значения k
        System.out.println("Введите позицию k:");
        int k = scanner.nextInt();
        scanner.nextLine(); // потребление новой строки после nextInt()

        // Ввод подстроки
        System.out.println("Введите подстроку для вставки:");
        String substring = scanner.nextLine();

        // Проверка допустимости значения k
        if (k < 0 || k >= text.length()) {
            System.out.println("Некорректное значение k.");
            return;
        }

        // Вставка подстроки после k-го символа
        String result = insertSubstring(text, k, substring);

        // Вывод результата
        System.out.println("Результат:");
        System.out.println(result);
    }

    // Метод для вставки подстроки после k-го символа
    public static String insertSubstring(String text, int k, String substring) {
        String before = text.substring(0, k);
        String after = text.substring(k);
        return before + substring + after;
    }
}
