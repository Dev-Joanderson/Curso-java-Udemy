package controle;

import javax.swing.*;

public class DesafioIf {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o n�mero.");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 ==0 ) {
			System.out.print("N�mero par.");
		}else {
			System.out.print("N�mero impar.");
		}
				
	}

}
