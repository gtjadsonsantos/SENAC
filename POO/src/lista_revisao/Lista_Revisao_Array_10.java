package src.lista_revisao;

import java.util.Scanner;

public class Lista_Revisao_Array_10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";

        System.out.println("Digite algo: ");
        text = keyboard.nextLine();
        System.out.println(
            text.replaceFirst(" ", ",").split(",")[0].toUpperCase() +
            text.replaceFirst(" ", ",").split(",")[1]
            );
    }
}   