package lambdaa;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args){

        Predicate<Produto> isCaro = prod -> (prod.preco*(1-prod.desconto)) >=750;
        Produto produto = new Produto("Notbook", 3200, 1);
        
        System.out.println(isCaro.test(produto));
    }
    
}
