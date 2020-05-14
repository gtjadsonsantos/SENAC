package src.lista_revisao;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random dado = new Random();

        for(int i = 1; i <= 10; i++){
            System.out.println("Jogando dado, partida " + i);
            System.out.println("resultado: " + (dado.nextInt(6) + 1));
        }
    }
}