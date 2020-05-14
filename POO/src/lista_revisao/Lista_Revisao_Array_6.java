package src.lista_revisao;

import java.util.Random;

public class Lista_Revisao_Array_6 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random sorteia = new Random();

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[l][c] = sorteia.nextInt(9);
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                int muiltplicator = 0;
                
                if(l == 0 && c == 0 || l == 1 && c == 1  || l == 2 && c == 2 ){
                    muiltplicator = 4;
                }else {
                    muiltplicator = 2;
                }

                matriz[l][c] = sorteia.nextInt(9) * muiltplicator;
            }
        }

        System.out.println(" " + matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);                
        System.out.println(" " + matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);     
        System.out.println(" " + matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2]);  

    }
}