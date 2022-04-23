package lambdaa;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String []arga){
       
        UnaryOperator<Integer> maisDois = n-> n+2;
        UnaryOperator<Integer> vezDois = n-> n*2;
        UnaryOperator<Integer> aoQuadrado= n-> n*n;
       
        int resultado=maisDois
            .andThen(vezDois)
            .andThen(aoQuadrado)
            .apply(0);

        System.out.println(resultado);

        int resultado2= aoQuadrado
            .compose(vezDois)
            .compose(maisDois)
            .apply(0);

        System.out.println(resultado2);

    }
    
}
