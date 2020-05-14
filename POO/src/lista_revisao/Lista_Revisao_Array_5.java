package src.lista_revisao;

import java.util.Random;

/* 
CRIE  UM  PROGRAMA QUE  TENHA DUAS MATRIZES(A E B) DE  INTEIROS  COM  DIMENSÕES 4 
LINHAS  POR 4 COLUNAS.OS  NÚMEROS  DEVEM  SER FORNECIDOS  DE  FORMA ALEATÓRIA.O PROGRAMA 
DEVERÁ  CRIAR  UMA TERCEIRAMATRIZ(SUBTRACAO) QUE  DEVE  CONTER  A SUBTRAÇÃO DA  POSIÇÃO DOS  
ELEMENTOS  DAS MATRIZES “A”E “B”.APRESENTE OS VALORES DASMATRIZES “A”,“B”E“SUBTRACAO”.
*/
public class Lista_Revisao_Array_5 {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        int[][] subtracao = new int[4][4];
        Random sorteia = new Random();

        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a.length; c++) {
                a[l][c] = sorteia.nextInt(9);
                b[l][c] = sorteia.nextInt(9);
            }
        }

        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a.length; c++) {
                subtracao[l][c] = a[l][c] - b[l][c];
            }
        }

        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a.length; c++) {
                System.out.println("Linha " + l + "  matriz a: " + a[l][c]);
                System.out.println("Linha " + l + "  matriz b: " + b[l][c]);
                System.out.println("Linha " + l + "  matriz sorteira: " + subtracao[l][c]);
            }
        }

    }
}