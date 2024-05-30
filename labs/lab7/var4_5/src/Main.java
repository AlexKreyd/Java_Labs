public class Main {
    public static void main(String[] args) {
        // Исходный текст
        String text = "Замммменить все оддддинаковые рядоммм стоящие символы в тексте однимммм символом.";
        System.out.println("Исходный текст: ");
        System.out.println(text + "\n");

        // Переменная для хранения преобразованного текста
        StringBuilder modifiedText = new StringBuilder();

        // Переменная для хранения последнего уникального символа
        char lastChar = '\0'; // '\0' - это символ конца строки, чтобы не совпадал с первым символом

        // Обходим каждый символ в тексте
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Если текущий символ отличается от предыдущего, добавляем его в преобразованный текст
            if (currentChar != lastChar) {
                modifiedText.append(currentChar);
                lastChar = currentChar;
            }
        }

        // Выводим преобразованный текст
        System.out.println("Преобразованный текст:");
        System.out.println(modifiedText.toString());
    }
}
