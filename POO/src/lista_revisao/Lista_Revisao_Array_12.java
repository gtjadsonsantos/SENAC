package src.lista_revisao;

import java.util.Arrays;
import java.util.Scanner;

public class Lista_Revisao_Array_12 {
    public static void main(String[] args) {
        String[] names = new String[10];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Informe um nome: ");
            names[i] = keyboard.nextLine();

        }   

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}