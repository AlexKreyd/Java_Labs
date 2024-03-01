import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; ++i){
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; ++i){
            if (check_number(numbers[i])){
                System.out.println(numbers[i]);
            }
        }

    }

    public static boolean check_number(int number){
        int n1 = number % 10;
        int n2 = number / 10 % 10;
        int n3 = number / 100;
        int count = 0;
        while (number != 0){
            number /= 10;
            count += 1;
        }
        return count == 3 && n1 != n2 && n1 != n3 && n2 != n3;
    }
}