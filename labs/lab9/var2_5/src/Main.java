import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple", "banana", "apricot", "blueberry", "cherry", "avocado"
        );

        Map<Character, List<String>> groupedByFirstChar = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        groupedByFirstChar.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
