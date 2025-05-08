package lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /*
            -BiFunction
            -Recibe dos valores y retorna un resultado
         */
        BiFunction<Integer,Integer,Integer> biFunction = (val1,val2) -> {
            return val1 + val2;
        };
        System.out.println(biFunction.apply(10,20));
    }
}
