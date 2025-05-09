package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie","Dan", "Elijah", "Fred", "George");
        names.stream()
                .filter( (val) ->{
                    return val.length() > 4;
                })
                .forEach( (val) -> {
                    System.out.println(val);
                });

    }
}
