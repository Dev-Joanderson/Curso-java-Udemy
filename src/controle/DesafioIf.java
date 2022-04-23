package controle;

import javax.swing.*;

public class DesafioIf {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o número.");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 ==0 ) {
			System.out.print("Número par.");
		}else {
			System.out.print("Número impar.");
		}
				
	}

}
