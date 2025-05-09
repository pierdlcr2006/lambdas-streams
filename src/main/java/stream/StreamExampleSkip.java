package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleSkip {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        //📚skip(): Omite un número específico de elementos

        names.stream()
                .skip(3)
                .forEach(System.out::println);

    }
}
