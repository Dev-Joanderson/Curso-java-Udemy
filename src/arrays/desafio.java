package arrays;

import java.util.Scanner;

public class desafio{
    public static void main(String []args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de notas;");
        int numNotas = entrada.nextInt();
        
        double [] lista = new double[numNotas];

        for(int i = 0; i < lista.length; i++ ){
            System.out.print("Informe a nota " + (i + 1) +": ");
            lista[i] = entrada.nextDouble();
        }
        double total = 0;
        for(double nota: lista){
            total += nota;
        }
        System.out.print("Sua média é :"+ total / lista.length);

        entrada.close();


    }
}