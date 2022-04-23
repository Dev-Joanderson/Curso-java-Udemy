package classe;

public class DataTeste {
 public static void main(String []args) {
	 
	 Data d1 = new Data(01, 01, 1970);

	 Data d2 = new Data();
	 d2.dia = 02;
	 d2.mes = 05;
	 d2.ano = 2000;
	 
	 System.out.println(d1.obterdata());
	 System.out.println(d2.obterdata());
 }
}
