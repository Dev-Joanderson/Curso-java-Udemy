package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		
	}
	
	Data (int diaInicial, int mesInicial,
			int anoInicial){
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
		
	}

	String obterdata() {
		String data = dia +"/" 
					+ mes + "/"
					+ ano; 
		return data;
	}
	
	static void teste() {
		
	}
}
