/* Desenvolva um programa onde é usuário irá digitar duas frases */
/* A - Informe o tamango de cada frase e qual a frase é a mais longa ? */
/* B -  Imprima a frase mais curta de trá para frente */

package src.exercicios;

import java.util.Scanner;

public class ExercicioString {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String  frase1;
        String frase2;

        System.out.println("Informe a primeira frase: ");   
        frase1 = teclado.nextLine();
        System.out.println("Informe a segunda frase: ");
        frase2 = teclado.nextLine();

        System.out.println("Tamanho da primeira frase: " + frase1.length() + " Tamanho da segunda frase: " + frase2.length());

        if(frase1.length() > frase2.length()){
            System.out.println("Frase 1 é mais longa");
            for(int i = frase1.length(); i > 0; i--){
                System.out.print(frase2.charAt(i - 1));
            }
        }else {
            System.out.println("Frase 2 é mais longa");

            for(int i = frase1.length() ; i > 0; i--){
                System.out.print(frase1.charAt(i - 1)  + " " );
                ;
            }
        }


        
    }
}