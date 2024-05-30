public class Matrix {
    private final int rows;
    private final int columns;
    private double[][] matrix;
    public Matrix(int m, int n) {
        this.rows = m;
        this.columns = n;
        this.matrix = new double[rows][columns];
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j){
                this.matrix[i][j] = 0;
            }
        }
    }

    public Matrix(int m, int n, double[][] array) {
        this.rows = m;
        this.columns = n;
        this.matrix = new double[rows][columns];

        for(int i = 0; i < m; ++i) {
            System.arraycopy(array[i], 0, this.matrix[i], 0, n);
        }
    }

    public void swap_rows(int k) {
        double min, max;
        min = max = this.matrix[0][k];
        int min_row = 0, max_row = 0;

        // поиск строк с минимальным и максимальным элементом в k-столбце
        for(int i = 1; i < this.rows; ++i) {
            if(this.matrix[i][k] > max) {
                max = this.matrix[i][k];
                max_row = i;
            } else if (this.matrix[i][k] < min) {
                min = this.matrix[i][k];
                min_row = i;
            }
        }

        // перестановка строк
        for(int j = 0; j < this.columns; ++j) {
            double temp = this.matrix[min_row][j];
            this.matrix[min_row][j] = this.matrix[max_row][j];
            this.matrix[max_row][j] = temp;
        }
    }

    public void make_squared() {
        try {
            double[][] temp_matrix = new double[this.rows][this.columns];
            for (int i = 0; i < this.rows; ++i) {
                for (int j = 0; j < this.columns; ++j) {
                    int sum = 0;
                    for (int z = 0; z < this.rows; ++z) {
                        sum += this.matrix[i][z] * this.matrix[z][j];
                    }
                    temp_matrix[i][j] = sum;
                }
            }
            for(int i = 0; i < this.rows; ++i) {
                System.arraycopy(temp_matrix[i], 0, this.matrix[i], 0, this.columns);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Матрицу нельзя возвести в квадрат, т.к количество строк и столбцов не равно");
        }
    }

    public void print() {
        for(int i = 0; i < this.rows; ++i) {
            for(int j = 0; j < this.columns; ++j) {
                System.out.printf("%.1f ", this.matrix[i][j]);
            }
            System.out.println();
        }
    }
}
