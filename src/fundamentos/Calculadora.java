package fundamentos;

import java.util.Scanner;

public class Calculadora {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o sugundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o operador 	'+'| '-' | '/' | * | % ");
		String op = entrada.next() ;
		
		double resultado = "+".equals(op) ? num1 +  num2 :0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",num1,op,num2,resultado);
		
		
		
		
		
		
		entrada.close();
		
	}

}
