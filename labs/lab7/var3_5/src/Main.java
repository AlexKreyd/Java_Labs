public class Main {
    public static void main(String[] args) {
        // Исходный текст
        String text = "Это пример предложения. Еще одно предложение. И наконец третье предложение.";

        // Разбиваем текст на предложения по точке с пробелом
        String[] sentences = text.split("\\.\\s+");

        // Обходим каждое предложение
        for (int i = 0; i < sentences.length; i++) {
            // Разбиваем предложение на слова по пробелам
            String[] words = sentences[i].split("\\s+");

            // Меняем местами первое и последнее слово в предложении
            String firstWord = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = firstWord;

            // Собираем предложение обратно из слов
            StringBuilder newSentence = new StringBuilder();
            for (String word : words) {
                newSentence.append(word).append(" ");
            }

            // Заменяем исходное предложение на новое в массиве предложений
            sentences[i] = newSentence.toString().trim();
        }

        // Собираем текст обратно из предложений
        StringBuilder newText = new StringBuilder();
        for (String sentence : sentences) {
            newText.append(sentence).append(". ");
        }

        // Выводим измененный текст
        System.out.println("Измененный текст:");
        System.out.println(newText.toString().trim());
    }
}
