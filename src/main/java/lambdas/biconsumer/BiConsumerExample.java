package lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*
            -BiConsumer
            -Recibe dos valores y no retorna nada
         */
        BiConsumer<String,String> biConsumer = (val1,val2)->{
            System.out.println(val1+ " " + val2);
        };
        biConsumer.accept("Hola","mundo");

    }
}
