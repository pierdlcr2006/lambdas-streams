package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleLimit {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");


        //📤limit(): Limita el número de elementos procesados

        names.stream()
                .limit(3)
                .forEach(System.out::println);


    }
}
