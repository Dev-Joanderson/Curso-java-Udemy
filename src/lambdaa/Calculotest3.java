package lambdaa;

import java.util.function.BinaryOperator;

public class Calculotest3 {
    public static void main(String[]args) {
        
        BinaryOperator <Double> calculo = (x,y)-> {return x+y;};
        
        System.out.println(calculo.apply(5.0, 5.0));

        calculo = (x,y)->x*y;
        System.out.println(calculo.apply(5.0, 5.0)); 
        System.out.println(Calculo.muitoLegal());

        
    }
    
}
