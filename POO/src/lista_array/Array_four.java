package src.lista_array;

import java.util.Scanner;

public class Array_four {
    public static void main(String[] args) {
        int[] nota1 = new int[5];
        int[] nota2 = new int[5];
        String[] nome = new String[5];
        int[] average = new int[5];
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            
            System.out.println("Aluno " + i + " informe seu nome: " );
            nome[i] = keyboard.next();

            System.out.println("Aluno " + i + " informe sua nota do 1 bimeste");
            nota1[i] = keyboard.nextInt();

            System.out.println("Aluno " + i + " informe sua nota do 2 bimeste");
            nota2[i] = keyboard.nextInt();

            average[i] = ( nota1[i] + nota2[i] ) / 2;

            System.out.println("Dados do aluno "+ i +" inseridos");
        }

        
        for(int i = 0; i < nome.length; i++){
            String status = average[i] > 7 ? "Aprovado":"Reprovado"; 
            System.out.println("Aluno " + nome[i] + " sua situação é: " + status );
        }
    }
}