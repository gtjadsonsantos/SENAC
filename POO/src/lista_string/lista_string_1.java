package src.lista_string;

import java.util.Scanner;

public class lista_string_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";

        System.out.println("Digite qualquer texto");
        text = keyboard.nextLine();

        String[] newText =  text.split(" ");
        
        System.out.println("Quantidade de palavras: " + newText.length);

    }
}