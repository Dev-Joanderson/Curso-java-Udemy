package classe;

public class ValorVsReferencia {
	public static void main(String []args) {
		
		double a = 1;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6,1998);
		Data d2 = d1;
		
		d1.dia = 21;
		d2.mes = 9;
		
		System.out.println("\n"+d1.obterdata());
		System.out.println("\n"+d2.obterdata());
		
		voltarDataParaValorPadrao(d1);
			
		System.out.println("\n"+d1.obterdata());
		System.out.println("\n"+d2.obterdata());
		
	}
	static void voltarDataParaValorPadrao(Data d){
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
