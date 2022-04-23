package classe;

public class Produtoteste {
	public static void main (String [] args) {
		
		Produto p1 = new Produto("Garrafa", 10.00);
		
		Produto p2 = new Produto("Copo", 5.00);
		
		//Produto.desconto = 0.50;
		System.out.println(p1.nome + " "+ p1.precoComDesconto());
		System.out.println(p2.nome + " "+ p2.precoComDesconto());
		
		
		
		double precoFinal1 =p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediacarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("M�dia do carrinho = R$:%.2f", mediacarrinho);
		
	}

}
