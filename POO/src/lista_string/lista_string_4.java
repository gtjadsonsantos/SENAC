package src.lista_string;

import java.util.Scanner;

public class lista_string_4 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] options = {
            "A)ONÚMERO DE CARACTERES DA PALAVRA.",
            "B)APALAVRACOM TODAS SUAS LETRAS EM MAIÚSCULO.",
            "C)ONÚMERO DEVOGAIS DA PALAVRA.",
            "D)SE A PALAVRADIGITADA COMEÇA COMUM TERMO A SER DIGITADO PELO USUÁRIO.",
            "E)SE A PALAVRADIGITADA TERMINA COM UM TERMO A SER DIGITADO PELO USUÁRIO."
        };
        String inpuText = "";

        System.out.println("Informe uma plavra: ");
        inpuText = keyboard.nextLine();

        for(int i = 0; i < options.length; i++){

            if(!inpuText.isEmpty()){
                System.out.println(options[i]);
            }
        }

    }
}