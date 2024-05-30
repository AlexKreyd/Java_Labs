import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RearrangeList {

    public static void rearrange(List<Integer> list) {
        int n = list.size();
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Найти первый отрицательный элемент слева
            while (left < right && list.get(left) >= 0) {
                left++;
            }

            // Найти первый положительный элемент справа
            while (left < right && list.get(right) < 0) {
                right--;
            }

            // Поменять местами отрицательный и положительный элементы
            if (left < right) {
                Collections.swap(list, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, -2, 3, -4, 5, -6, 7, -8, 9, -10));
        System.out.println("Исходный список: " + list);

        rearrange(list);

        System.out.println("Преобразованный список: " + list);
    }
}
