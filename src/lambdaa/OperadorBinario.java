package lambdaa;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[]args){

        BinaryOperator<Double> media=
        (Double n1, Double n2) ->(n1 + n2)/2;

        System.out.println(media.apply(8.3, 8.2));

        BiFunction< Double, Double, String> resultado = (n1, n2) ->{
            double notaFinal = (n1 + n2)/2;
            return notaFinal >=7 ? "Aprovado": "Reprovado";
        };
        
        System.out.println(resultado.apply(9.8, 4.0));

        Function<Double, String> conceito = 
            m -> m >7? "Aprovado":"Reproado";

        System.out.println(media.andThen(conceito).apply(9.8, 5.0));

    } 
        
    
    
}
