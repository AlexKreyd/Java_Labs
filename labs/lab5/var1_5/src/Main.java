import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Matrix[] matrices = new Matrix[2];
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Введите количество строк: ");
                int rows = scanner.nextInt();
                System.out.println("Введите количество столбцов");
                int columns = scanner.nextInt();
                scanner.nextLine();
                double[][] arr = new double[rows][columns];
                for (int j = 0; j < rows; j++) {
                    System.out.println("Введите ряд " + (j + 1));
                    String[] row = scanner.nextLine().split(" ");
                    for (int k = 0; k < row.length; k++) {
                        arr[j][k] = Double.parseDouble(row[k]);
                    }
                    matrices[i] = new Matrix(rows, columns, arr);
                }
            }

            // задаем номер столбца для метода перестановки строк
            int k = 0;
            for (int i = 0; i < 2; ++i) {
                matrices[i].swap_rows(k);
            }
            for (int i = 0; i < 2; ++i) {
                System.out.printf("Matrix № %d\n", i + 1);
                matrices[i].print();
                System.out.println();
            }

            // возведение матрицы в квадрат
            System.out.println("Возведения в квадрат матрицы 1:");
            matrices[0].make_squared();
            matrices[0].print();

            System.out.println("Возведение в квадрат матрицы 2:");
            matrices[1].make_squared();
            matrices[1].print();
        } catch (InputMismatchException e) {
            System.out.println("Введено не числовое значение для кол-ва строк/столбцов или значений элемента матрицы");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Элементов в введенной строке больше, чем задано перед этим");
        }
    }
}