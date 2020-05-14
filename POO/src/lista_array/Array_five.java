package src.lista_array;

import java.util.Scanner;

public class Array_five {
    public static void main(String[] args) {
        int[] origem = new int[10];
        int[] resultado = new int[10];
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < origem.length; i++){
            System.out.println("Informe um número: ");
            origem[i] = keyboard.nextInt();
        }

        for(int i = 0; i < origem.length; i++){

            int status = origem[i] % 2 == 0 ? 1:0;
            resultado[i] = status;
            System.out.println(resultado[i]);
        }
        
    }
} 