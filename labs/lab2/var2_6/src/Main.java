import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер квадратной матрицы n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int randomNum = ThreadLocalRandom.current().nextInt(-n, n + 1);
                matrix[i][j] = randomNum;
            }
        }
        System.out.println("Исходная матрица");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        double norm = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                norm += Math.pow(matrix[i][j], 2);
            }
        }

        norm = Math.sqrt(norm);
        System.out.printf("\nНорма матрицы = %.2f\n", norm);

        String surname = "Крейденко";
        String receive_date = "09.02.2024 13:50";
        Calendar submit_date = Calendar.getInstance();
        System.out.printf("\nФамилия разработчика: %s\n" +
                        "Дата и время получения задания: %s\n" +
                        "Дата и время сдачи задания: %s",
                surname, receive_date, submit_date.getTime());
    }
}