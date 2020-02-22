package src.exercicios;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe quantos quilometros seu carro faz por litro: ");
        double quilometros =  keyboard.nextInt();
        
        System.out.println("Informe a velocidade média: ");
        double velocidade =  keyboard.nextInt();

        System.out.println("Informe o tempo gasto na viajem: ");
        double tempo =  keyboard.nextInt();

        double distancia = velocidade * tempo;
        double consumo = 1000 / quilometros ;

        System.out.println("Distância percorrida: " + distancia + " " +  "consumo: " + consumo);

    }

}