package oo.composiçao;

public class Motor {
	
	final Carro carro;

	boolean ligado = false;
	double fatorInjecao = 1;

	public Object caro;
	
	Motor(Carro carro){
		this.carro = carro;
	}

	int giros () {
		if(!ligado){
			return 0;
		}else{
			return (int) Math.round(fatorInjecao * 3000);
		}
		
	}
	

}
