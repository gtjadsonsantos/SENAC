package src.lista_revisao;

import java.util.Scanner;

public class Lista_Revisao_Array_8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";

        System.out.println("Digite algo: ");
        text = keyboard.next();

        for(int i = 0; i < text.length(); i++){
            System.out.println(text.substring(0,0));
            System.out.println(text.substring(0,1));
            System.out.println(text.substring(0,2));
            System.out.println(text.substring(0,3));
            System.out.println(text.substring(0,text.length()));
            System.out.println(text.substring(0,3));
            System.out.println(text.substring(0,2));
            System.out.println(text.substring(0,1));
            System.out.println(text.substring(0,0));
        }
        
    }
}