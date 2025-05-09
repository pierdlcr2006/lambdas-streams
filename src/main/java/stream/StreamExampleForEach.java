package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");

        // 💥 forEach(): Aplica una acción a cada elemento

        names.stream()
                .forEach( (val) ->{
                    System.out.println(val);
                });
    }
}
