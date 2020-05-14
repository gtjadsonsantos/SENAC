package src.lista_revisao;


import java.util.Arrays;
import java.util.Random;

public class Lista_Revisao_Array_11 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9);
        }   

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}