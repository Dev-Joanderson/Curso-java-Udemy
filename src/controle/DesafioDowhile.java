package controle;

import java.util.Scanner;

public class DesafioDowhile {
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);   
		
		int quantidade = 0;// 100
		double total = 0; //9.55
		double nota = 0;
		
		while(nota !=-1) {
			System.out.println("Digite uma nota.\nou -1 para sair");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidade++;	
			}else if(nota != -1) {
				System.out.println("Nota inv�lida.");
			}
		}
		double media = total/quantidade;
		
		System.out.println("Media = " + media);
		
		
		
		entrada.close();
	}

}
