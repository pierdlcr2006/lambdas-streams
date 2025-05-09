package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleDisntinct {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Ana", "Ana","Dan", "Dan", "Fred", "George");

        // ⭐️distinct(): Elimina los elementos duplicados

        names.stream()
                .distinct()
                .forEach( (value) ->{
                    System.out.println(value);
                });


    }
}
