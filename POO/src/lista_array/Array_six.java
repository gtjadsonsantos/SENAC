package src.lista_array;

import java.util.Scanner;

public class Array_six {
    public static void main(String[] args) {
        int[] integer = new int[3];
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < integer.length; i++){
            System.out.println("Informe " + i + " numero: ");
            integer[i] = keyboard.nextInt();
        } 
        
        for(int i = 0; i < integer.length; i++){
            System.out.println("TABUADA DO " + integer[i]);
            for(int z = 0; z < 10; z++){
                int valor = integer[i] * z;

                System.out.println(integer[i] + " * " + z + " = " + valor );
            }
        } 

    }
}