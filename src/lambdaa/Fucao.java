package lambdaa;

import java.util.function.Function;


public class Fucao{
    private static String resultadoFinal;

    public static void main(String [] args){
      
        Function<Integer, String> parDuImpar =
         numero -> numero%2==0?"par":"impar";

         System.out.println(parDuImpar.apply(32));

         Function<String, String> oResultado =
         valor -> "O resultado é: " +valor;
         
         Function<String, String> empolgado =
         valor-> valor + "!!!";

         resultadoFinal = parDuImpar.andThen(oResultado).andThen(empolgado).apply(34);
         
         System.out.print(resultadoFinal);


    }

}