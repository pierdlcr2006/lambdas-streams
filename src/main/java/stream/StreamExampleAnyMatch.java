package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleAnyMatch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        //🔍 anyMatch(): Verifica si algún elemento cumple una condición y es un operador final

        boolean result = names.stream()
                .anyMatch( (val) ->{
                    return val.startsWith("K");
                });
        System.out.println(result);
        
    }
}
