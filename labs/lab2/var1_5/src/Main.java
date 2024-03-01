import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            String word = scanner.nextLine();
            words.add(word);
        }

        for (String word : words) {
            if (check_word(word)) {
                System.out.println(word);
            }
        }
    }

    public static boolean check_word(String word){
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));
            if (c < 'a' || c > 'z'){
                return false;
            }
            if ("aeiou".indexOf(c) != -1) {
                vowels += 1;
            }
            else consonants += 1;
        }
        return vowels == consonants;
    }
}