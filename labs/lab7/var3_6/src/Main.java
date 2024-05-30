public class Main {
    public static void main(String[] args) {
        // Исходное предложение
        String sentence = "В этом предложении слова меняются местами";
        System.out.println("Исходное предложение:");
        System.out.println(sentence + "\n");

        // Разбиваем предложение на слова
        String[] words = sentence.split("\\s+");

        // Меняем местами слова
        String lastWord = words[words.length - 1];
        for (int i = words.length - 1; i > 0; i--) {
            words[i] = words[i - 1];
        }
        words[0] = lastWord;

        // Собираем предложение обратно из слов
        StringBuilder newSentence = new StringBuilder();
        for (String word : words) {
            newSentence.append(word).append(" ");
        }

        // Выводим измененное предложение
        System.out.println("Преобразованное предложение:");
        System.out.println(newSentence.toString().trim());
    }
}
