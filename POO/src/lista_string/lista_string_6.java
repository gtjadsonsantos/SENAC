package src.lista_string;

import java.util.Scanner;

public class lista_string_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";
        String newText = "";
        String inputWordSearch = "";
        String currentWord = "";
        int count = 0;

        System.out.println("Informe uma texto");
        text = keyboard.nextLine();

        System.out.println("Insira a palavra que irá substituir: ");
        inputWordSearch = keyboard.next();

        System.out.println("Insira uma palavra do texto ");
        currentWord = keyboard.next();

        for(int i = 0; i < text.split(" ").length ; i++){

            if(text.split(" ")[i].equals(currentWord)){
               count = count + 1;
            }
        
        }
        newText = text.replaceAll(currentWord,inputWordSearch);
       
        System.out.println(text);
        System.out.println(newText);
        System.out.println("Palavra informada: " + inputWordSearch);
        System.out.println("Essa palavra foi encontrada " + count + " vezes no texto");
    }
}