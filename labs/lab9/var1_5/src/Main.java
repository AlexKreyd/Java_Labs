import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "grape"
        );

        List<String> uniqueStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());

        uniqueStrings.forEach(System.out::println);
    }
}
