package src.lista_revisao;

import java.util.Scanner;

public class Lista_Revisao_Array_2 {
    public static void main(String[] args) {
        int[] numero = new int[5];
        int[] multiplicator = new int[5];
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < numero.length; i++){
            System.out.println("Informe um número para posição " + i + " : ");
            numero[i] = keyboard.nextInt();

            int valor =  numero[i] * (numero[i] % 2  == 0 ? 2:3);
            multiplicator[i] = valor;
        }

        for (int i = 0; i < multiplicator.length; i++){
            System.out.println("Posição " + i + " tem o valor: " + multiplicator[i]);
        }
    }
}