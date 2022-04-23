package arrays;

import java.util.Arrays;

public class Exercicio{
    public static void main(String [] args){

        double [] notasAlunoA = new double [4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 8;
        //System.out.println(Arrays.toString(notasAlunoA));
        
        for (int i = 0; i < notasAlunoA.length; i++){

           //System.out.println(total);
        }
       // System.out.println(total/notasAlunoA.length);

        final double notaArnmazenada = 5.9;
        double[] notasAlunoB = {8, notaArnmazenada, 10, 9};
        
        System.out.println(Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i]; 
        }

        System.out.println(totalAlunoB/4);
    }
}