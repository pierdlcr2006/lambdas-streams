package lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        /*
            -Predicate
            -Recibe un valor y devuelve un booleano(true or false)
         */
        Predicate<String>predicate = (value) -> {
            return value.length() > 5;
        };
        System.out.println(predicate.test("Hola"));
    }
}
