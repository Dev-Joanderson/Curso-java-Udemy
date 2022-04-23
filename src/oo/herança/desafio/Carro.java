package oo.herança.desafio;

public class Carro{
    
    int velocidadeAtual;

    void acelera(){
        velocidadeAtual += 5;

    }
    void frear(){
        if(velocidadeAtual >=5){
            
            velocidadeAtual-=5;
        }else{
            velocidadeAtual = 0;
        }
    }
    public String toString(){
        return "velocidade Atual é "+velocidadeAtual+ "km/h.";
    }
}