package oo.composiçao;

import java.util.ArrayList;

public class Compra {
    
    String Cliente;
    ArrayList<Item> itens= new ArrayList<Item>();

    void adcionarItem(String nome, int quantidade, double preco){
        this.adcionarItem(new Item(nome, quantidade, preco));
    }

    void adcionarItem(Item item){
        itens.add(item);
        item.compra= this;
    }

    double obterValorTotal (){
        double total = 0;

        for(Item i : itens){
            total += i.quantidade * i.preco;
        }
        return total;
    }
    
}
