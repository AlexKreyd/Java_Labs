import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число слов n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            words.add(scanner.nextLine());
        }

        for(String word: words){
            boolean flag = true;
            for(int i = 0; i < word.length() - 1; i++){
                if(word.charAt(i) >= word.charAt(i + 1)) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(word);
                break;
            }
        }
        String surname = "Крейденко";
        String receive_date = "09.02.2024 13:50";
        Calendar submit_date = Calendar.getInstance();
        System.out.printf("Фамилия разработчика: %s\n" +
                        "Дата и время получения задания: %s\n" +
                        "Дата и время сдачи задания: %s",
                surname, receive_date, submit_date.getTime());
    }
}