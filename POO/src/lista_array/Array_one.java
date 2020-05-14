package src.lista_array;

import java.util.Scanner;

public class Array_one {
    public static void main(String[] args) {
       
        
       Scanner keyboard = new Scanner(System.in);
       int[] array = new int[10];
        
       for (int i = 0; i < array.length; i++) {

        System.out.println("Insira um valor inteiro na " + i + " posição do array");
        int input = keyboard.nextInt();

        array[i] = (input % 2) == 0 ? input:0;
       }

       for (int i = 0; i < array.length; i++){
         System.out.print(array[i]  + " ");
       }

       System.out.println("O array é de: " + array.length);



    }
}