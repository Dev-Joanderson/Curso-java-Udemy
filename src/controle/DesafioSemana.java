package controle;
import java.util.Scanner;
public class DesafioSemana {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da semana!");
		String semana = entrada.next();
		
		if ("Domingo".equalsIgnoreCase(semana)) {
			System.out.print("1");	
		}else if ("segunda".equalsIgnoreCase(semana)) {
			System.out.print("2");
		}else if ("terça".equalsIgnoreCase(semana)||"terca".equalsIgnoreCase(semana) ) {
			System.out.print("3");
		}else if ("quarta".equalsIgnoreCase(semana)) {
			System.out.print("4");
		}else if ("quinta".equalsIgnoreCase(semana)) {
			System.out.print("5");
		}else if ("sexta".equalsIgnoreCase(semana)) {
			System.out.print("6");
		}else if ("sabado".equalsIgnoreCase(semana)) {
			System.out.print("7");
		}

		System.out.println("\n" + semana);
		entrada.close();
			
	}

}
