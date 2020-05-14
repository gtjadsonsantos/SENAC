package src.lista_array;

import java.util.Random;

public class Array_two {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100) + 1;
        }

        for(int i = 0; i < array.length; i++){
            sum += array[i]; 
        }

        System.out.println("A soma dos valores do array deu: " + sum);
    }
}