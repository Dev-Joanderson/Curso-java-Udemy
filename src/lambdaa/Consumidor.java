package lambdaa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String [] args){
        
        Consumer<Produto> imprimir = p->System.out.println(p.nome);

        Produto p1 = new Produto("caneta", 2, 0.1);
        imprimir.accept(p1);

        Produto p2 = new Produto("Lapis", 5, 0.17);
        Produto p3 = new Produto("Blusa", 2, 0.20);
        Produto p4 = new Produto("Bermuda", 2, 0.3);
        Produto p5 = new Produto("Cueca", 2, 0.14);
       
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4 ,p5);
       
        produtos.forEach(imprimir);
        produtos.forEach(p-> System.out.println(p.preco));
        produtos.forEach(System.out::println);



    }
    
}
