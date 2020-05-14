package src.lista_revisao;

import java.util.Scanner;

public class Lista_Revisao_Array_9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";

        System.out.println("Digite algo: ");
        text = keyboard.next();

        for(int i = text.length() ; i > 0 ; i--){
           System.out.print(text.charAt(i - 1));
        }
        
    }
}