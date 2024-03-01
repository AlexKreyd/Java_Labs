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

        bubbleSort(numbers);

        for(int i = 0; i < n; ++i){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; ++i){
            for(int j = 0; j < arr.length - i - 1; ++j){
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}