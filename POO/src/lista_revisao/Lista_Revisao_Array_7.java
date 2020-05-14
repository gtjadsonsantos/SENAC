package src.lista_revisao;

import java.util.Scanner;

public class Lista_Revisao_Array_7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";
        

        System.out.println("Digite algo: ");
        text = keyboard.nextLine();

        String[] newText = text.split(" ");
        
        for(int i = 0; i < newText.length; i++){
            System.out.println(newText[i]);
        }
        
    }
}