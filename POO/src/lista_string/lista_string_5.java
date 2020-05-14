package src.lista_string;

import java.util.Scanner;

public class lista_string_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";

        System.out.println("Informe um verbo: ");
        text = keyboard.next().toUpperCase();

        if(text.endsWith("AR")){
            System.out.println("EU " + text.replace("AR", "O"));
            System.out.println("TU " + text.replace("AR", "AS"));
            System.out.println("ELE " + text.replace("AR", "A"));
            System.out.println("NÓS " + text.replace("AR", "AMOS"));
            System.out.println("VÓS " + text.replace("AR", "AIS"));
            System.out.println("ELES " + text.replace("AR", "AM"));
        }
    }
}