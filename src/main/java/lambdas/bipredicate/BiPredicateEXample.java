package lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateEXample {
    public static void main(String[] args) {
        /*
            -BiPredicate
            -Recibe dos valores y retorna un booleano
         */
        BiPredicate<Integer,Integer> biPredicate = (val1,val2) ->{
            return val1>=val2;
        };
        System.out.println(biPredicate.test(10,5));

    }
}
