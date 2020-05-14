 package src.lista_string;

import java.util.Scanner;

public class lista_string_7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = "";

        System.out.println("Inform um número: ");
        input = keyboard.nextLine();

        String[] outputString = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {

            switch (input.charAt(i)) {
                case '0':
                    outputString[i] = "ZERO";
                    break;
                case '1':
                    outputString[i] = "UM";
                    break;
                case '2':
                    outputString[i] = "DOIS";
                    break;
                case '3':
                    outputString[i] = "TRÊS";
                    break;
                case '4':
                    outputString[i] = "QUATRO";
                    break;
                case '5':
                    outputString[i] = "CINCO";
                    break;
                case '6':
                    outputString[i] = "SEIS";
                    break;
                case '7':
                    outputString[i] = "SETE";
                    break;
                case '8':
                    outputString[i] = "OITO";
                    break;
                case '9':
                    outputString[i] = "NOVE";
                    break;
                default:
                    break;
            }
        }

        for(int i = 0; i < input.length(); i++){
            String split = i == input.length() - 1 ? ". ":", ";

            System.out.print(outputString[i] + split );
        }

    }
}