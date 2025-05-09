package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleCollect {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        // 📦 collect(): Recoge los elementos en una colección

        List<String> result =names.stream()
                .map( (value) -> {
                    return value.toUpperCase();
                })
                .collect(Collectors.toList());
        //se puede reemplzar por el .toList a partir de Java17

        System.out.println(result);

    }
}
