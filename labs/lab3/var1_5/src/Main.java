public class Main {
    public static void main(String[] args) {
        Matrix[] matrices = new Matrix[4];

        matrices[0] = new Matrix(2, 2);

        double[][] array1 = {{3, 5}, {9, 2}, {13,4}};
        matrices[1] = new Matrix(3, 2, array1);

        double[][] array2 = {{16, 2, 8}, {7, 5, 1}, {23,30, 13}};
        matrices[2] = new Matrix(3, 3, array2);

        double[][] array3 = {{1, 12}, {5, 3}};
        matrices[3] = new Matrix(2, 2, array3);

        // задаем номер столбца для метода перестановки строк
        int k = 0;
        for(int i = 0; i < 4; ++i){
            matrices[i].swap_rows(k);
        }
        for(int i = 0; i < 4; ++i) {
            System.out.printf("Matrix № %d\n", i + 1);
            matrices[i].print();
            System.out.println();
        }

        // возведение матрицы в квадрат
        matrices[1].make_squared();

        matrices[2].make_squared();
        System.out.println("Матрица № 3, возведенная в квадрат:");
        matrices[2].print();
    }
}