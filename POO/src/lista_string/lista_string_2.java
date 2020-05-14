package src.lista_string;

import java.util.Arrays;
import java.util.Scanner;

public class lista_string_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";
        String inputWord = "";
        int count = 0;

        System.out.println("Informe uma texto");
        text = keyboard.nextLine();

        System.out.println("Insira uma palavra: ");
        inputWord = keyboard.next();

        for(int i = 0; i < text.split(" ").length ; i++){

            if(text.split(" ")[i].equals(inputWord)){
               count = count + 1;
            }
        }

       
        System.out.println(text);
        System.out.println("Palavra informada: " + inputWord);
        System.out.println("Essa palavra foi encontrada " + count + " vezes no texto");
    }
}