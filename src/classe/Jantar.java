package classe;

public class Jantar {
	public static void main(String [] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijao", 0.300);
		
		Pessoa p2 = new Pessoa("João", 70);
		
		System.out.println(p2.apresentar());
		p2.comer(c1);
		System.out.println(p2.apresentar());
		p2.comer(c2);
		System.out.printf(p2.apresentar());
	}

}
