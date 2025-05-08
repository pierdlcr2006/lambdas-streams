package lambdas.function;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctioExample {
    public static void main(String[] args) {

        /*
            -Function
            -Recibe un valor y retorna un resultado
         */
        Function<Integer,String> supplier = (value) -> {
            return "Hola tu edad es " + value;
        };
        System.out.println(supplier.apply(10));


    }
}
