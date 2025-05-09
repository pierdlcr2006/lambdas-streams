package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleSorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Elijah", "Charlie","Dan", "Fred", "George","Ana");

        // 📊sorted(): Ordena los elementos del stream

        names.stream()
                .sorted()
                .forEach( (name) ->{
                    System.out.println(name);
                });

    }
}
