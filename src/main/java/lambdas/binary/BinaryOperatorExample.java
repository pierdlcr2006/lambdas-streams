package lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /*
            -BinaryOperator
            -Recibe dos valores del mismo tipo y retorna un valor del mismo tipo
         */
        BinaryOperator<Integer> binaryOperator = (value1,value2) ->{
            return value1 + value2;
        };
        System.out.println(binaryOperator.apply(5,4));
    }
}
