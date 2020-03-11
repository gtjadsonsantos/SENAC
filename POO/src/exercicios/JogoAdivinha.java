package src.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        Scanner teclado = new Scanner(System.in);

        int entradaUsuario ;
        int numeroSorteador;
        numeroSorteador = gerador.nextInt(9) + 1;

        for(int i = 0; i < 5; i++){
            System.out.println("Informe seu chute da " + i + " chance: ");
            entradaUsuario = teclado.nextInt();     
            
            if(numeroSorteador == entradaUsuario){
                System.out.println("Você acertou");
            }else {
                System.out.println("Você errou");

            }

        }
        

    }
}