import java.util.ArrayList;
import java.util.List;

public class PolynomialMultiplication {

    // Метод для умножения двух многочленов
    public static List<Integer> multiplyPolynomials(List<Integer> poly1, List<Integer> poly2) {
        int degree1 = poly1.size() - 1;
        int degree2 = poly2.size() - 1;
        int resultDegree = degree1 + degree2;

        // Создаем список для хранения коэффициентов результирующего многочлена
        List<Integer> result = new ArrayList<>(resultDegree + 1);
        for (int i = 0; i <= resultDegree; i++) {
            result.add(0);
        }

        // Умножаем многочлены
        for (int i = 0; i <= degree1; i++) {
            for (int j = 0; j <= degree2; j++) {
                int coefficient = result.get(i + j) + poly1.get(i) * poly2.get(j);
                result.set(i + j, coefficient);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Пример многочленов
        List<Integer> poly1 = List.of(1, 2, 3); // 1 + 2x + 3x^2
        List<Integer> poly2 = List.of(4, 5);    // 4 + 5x

        // Умножение многочленов
        List<Integer> result = multiplyPolynomials(poly1, poly2);

        // Вывод результата
        System.out.println("Результат умножения многочленов:");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i > 0) {
                System.out.print("x^" + i);
            }
            if (i < result.size() - 1) {
                System.out.print(" + ");
            }
        }
    }
}
