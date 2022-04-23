package oo.herança.desafio;

public class CarroTeste {
    public static void main(String[] args){
        
        Carro c1 = new Civic();
    
        c1.acelera();
        System.out.println(c1);
        
        c1.acelera();
        System.out.println(c1);

        c1.acelera();
        System.out.println(c1);
        
        c1.acelera();
        System.out.println(c1);
    
        Carro c2 = new Ferrari();

        c2.acelera();
        System.out.println(c2);

        c2.acelera();
        System.out.println(c2);
        
        c2.acelera();
        System.out.println(c2);


    }
    
}
