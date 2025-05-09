package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleReduce {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        // 🧩 reduce(): Combina todos los elementos en un solo valor y es un operador final
        // El identificador es un string que se antepone al resultado

        String result = names.stream()
                .reduce("Nombres:",(val1,val2)->{
                    return val1+ " " +val2;
                });
        System.out.println(result);
    }
}
