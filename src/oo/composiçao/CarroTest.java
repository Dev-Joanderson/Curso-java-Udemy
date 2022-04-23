package oo.composiçao;

public class CarroTest {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigao());

        c1.ligar();
        System.out.println(c1.estaLigao());
        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.motor.giros());
        //relçao bidirecional
        
        //System.out.println(c1.motor.caro.motor.caro.motor.giros());
    }
    
}
