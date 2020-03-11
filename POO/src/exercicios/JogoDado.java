package src.exercicios;

import java.util.Random;


public class JogoDado {

    public static void main(String[] args) {
        
        int[] partidas = new int[5];
        Random dado = new Random();
        
        for(int i = 0; i < partidas.length; i++){
            System.out.println("Partida :" + i);
            partidas[i] = dado.nextInt(7) + 1; 
        }

        System.out.println();
        
        for(int i = 0; i < partidas.length ; i++) {
            System.out.print(partidas[i] + " ");
        }

        System.out.println();
        
        for(int i = partidas.length; i > 0; i--){
            System.out.print(partidas[i -1] + " ");
        }


    }
}