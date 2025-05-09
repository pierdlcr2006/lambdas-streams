package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleAllMatch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        // 🔒 allMatch(): Verifica si todos los elementos cumplen una condición y es un operador final
        boolean result = names.stream()
                .allMatch( (name) -> {
                    return name.startsWith("A");
                });
        System.out.println(result);
    }
}
