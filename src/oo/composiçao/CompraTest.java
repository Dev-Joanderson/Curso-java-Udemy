package oo.composiçao;

public class CompraTest {
    public static void main(String[] args){

        Compra c1 = new Compra();
        
        c1.adcionarItem("Caneta",22, 1.50);
        c1.adcionarItem("Borracha", 12, 0.5);
        c1.adcionarItem("caderno",3, 20.50);

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
        
        double total = c1.itens.get(0).compra.itens.get(1)
            .compra.obterValorTotal();

            System.out.println("O total é " + total);

    }
    
}
