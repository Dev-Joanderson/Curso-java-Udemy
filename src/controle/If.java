package controle;

import java.util.Scanner;

public class If {
	public static void main(String [] argas) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe a m�dia: ");
		String valor1 = entrada.next().replace(",", ".");
		
		double media = Double.parseDouble(valor1);
		
		if (media >= 7 && media <=10) {
			System.out.print("Aprovado!!!\nParab�ns!!!");
		}
		if(media >=4.5 && media < 7 ) {
			System.out.print("Voce ficou em recupera��o.\nBoa sorte.");
		}
		if(media < 4.5) {
			System.out.print("Voce foi reprovado.\nTente novamente.");
		}
		
		entrada.close();
		
		
	}

}
