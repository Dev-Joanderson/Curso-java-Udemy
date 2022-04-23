package lambdaa;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String []args) {

        
        /* 1. Apartir do produto calcular o preco real (com desconto)
         * 2. Imposto Mnicipal: 2500 (8,5%)/ < 2500(Isento)
         * 3. Frete: >= 3000 (100)/<3000(50)
         * 4. Arrendondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */
        
         Function<Produto, Double>precoFinal= 
            prod-> prod.preco*(1-prod.desconto);

         UnaryOperator<Double> impostoMunicipal=
            preco -> preco >= 2500 ? preco * 1.085: preco ;

         UnaryOperator<Double> frete=
         preco -> preco >=3000 ? preco + 100 : preco + 50;

         Function<Double, String> arredondar= 
            preco -> String.valueOf(String.format("%.2f", preco)).replace(".", ",");

         
        
        Produto p = new Produto("iPad", 3235.89, 0.13);

         String preco = precoFinal
            .andThen(impostoMunicipal)
            .andThen(frete)
            .andThen(arredondar)
            .apply(p);


        System.out.println(preco);


    }
    
}
