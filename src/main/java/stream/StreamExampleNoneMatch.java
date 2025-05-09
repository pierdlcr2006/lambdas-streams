package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleNoneMatch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        //❌ noneMatch(): Verifica si ningun elemento cumple la condición y es un operador final

        boolean result =names.stream()
                .noneMatch( (value) ->{
                    return value.length() == 3;
                });
        System.out.println(result);
    }
}
