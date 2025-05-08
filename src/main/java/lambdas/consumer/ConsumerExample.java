package lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /*
        - Consumer
        - Recibe un valor y no retorna nada
         */

        /*
        Consumer<String> consumer = (value) -> {
            System.out.println(value);
        };
        */

        //Otra forma de hacer y mas reducida
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hola mundo");

    }

}
