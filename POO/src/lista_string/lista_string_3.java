package src.lista_string;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;

public class lista_string_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = "";
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        System.out.println("Informe uma texto");
        text = keyboard.nextLine().toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            switch (text.charAt(i)) {
                case 'a':
                    countA = countA + 1;
                    break;
                case 'e':
                    countE = countE + 1;
                    break;
                case 'i':
                    countI = countI + 1;
                    break;
                case 'o':
                    countO = countO + 1;
                    break;
                case 'u':
                    countU = countU + 1;
                    break;
                default:
                    break;
            }

        }

        System.err.println("Frase " + text);
        System.out.println("A: " + countA + " E: " + countE + " I: " + countI + " O: " + countO + " U: " + countU);
    }
}