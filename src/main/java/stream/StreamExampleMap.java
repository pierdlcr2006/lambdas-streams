package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        // 🚀map(): Transforma los elementos aplicando una función

        names.stream()
                .map( (val) -> {
                    return val.toUpperCase();
                }).filter( (val) ->{
                    return val.startsWith("A");
                }).forEach((val) ->{
                    System.out.println(val);
                });

    }
}
