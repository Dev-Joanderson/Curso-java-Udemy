package fundamentos;

public class DesafioAritmetico {
	public static void main(String[]args) {
		
		double parte1 = (6*(3+2));
		double potencia1 = Math.pow(parte1, 2);
		double valor1 = potencia1 /6;
		
		double parte2 = ((1-5)* (2-7))/2;
		double potencia2 = Math.pow(parte2, 2);
		
		double valorPartes = (valor1 - potencia2);
		
		double divPotencial1 = Math.pow(valorPartes, 3);
		double divPotencial2 = Math.pow(10, 3);
		
		double resultado = divPotencial1/divPotencial2;
		
	
		System.out.println(resultado);
	
		
	}

}
