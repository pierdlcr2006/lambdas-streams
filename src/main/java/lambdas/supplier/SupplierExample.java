package lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /*
            -Supplier
            -No recibe ningún valor pero retorna un resultado
         */
        Supplier<String> suppplier = () ->{
          return "Hola mundo";
        };
        System.out.println(suppplier.get());
    }
}
