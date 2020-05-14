package src.lista_revisao;

import java.util.Scanner;
/*
3–DESENVOLVA UM PROGRAMA QUE LEIA 10 NÚMEROS ENTRE 1 A 9E CALCULE A MÉDIA DOS NÚMEROS.CASO O NÚMERO
DIGITADO ESTEJAFORA DA FAIXAESTABELECIDA(1A 9),MOSTRAR A MENSAGEM DE "NÚMERO FORA DA  FAIXA".OS  NÚMEROS  
FORA  DA  FAIXA  NÃO  CONTABILIZAMNOS 10NÚMEROSA  SEREM  LIDOS,OU  SEJA,DEPENDENDO DOS NÚMEROS O SISTEMA 
DEVERÁ LER MAIS DO QUE 10 NÚMEROS.

*/

public class Lista_Revisao_Array_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] numeros = new int[10];
        int average = 0;
        int sum = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + ". Informe um número de 1 a 9: ");
            int input = keyboard.nextInt();

            while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5 && input != 6 && input != 7
                    && input != 8 && input != 9) {

                System.out.println("NÚMERO FORA DA  FAIXA");
                System.out.println("Informe um número de 1 a 9: ");
                input = keyboard.nextInt();

            }
            numeros[i] = input;
        }

        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }

        average = sum / numeros.length;

        System.out.println("Média dos números: " + average);
    }
}