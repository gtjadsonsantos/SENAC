
package src.exercicios;

import java.util.Random;
import java.util.Scanner;

public class AplicandoArrays {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Defina o tamanho do Array");
        
        int[] array = new int[teclado.nextInt()];

        System.out.println();

        for(int i = 0; i < array.length; i++ ){
            array[i] = gerador.nextInt(9) + 1;
            System.out.println(array[i] + " ");
        }

        System.out.println();
        
        for(int i = array.length ; i > 0; i--){
            System.out.print(array[i - 1] + " ");
        }
        
        System.out.println();
        
        for(int i = array.length - 1 ; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        
        
    }
}