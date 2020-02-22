package src.exemplos;

import java.util.Scanner;

public class FundamentosJava {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Informe o número");
    
    int number = keyboard.nextInt();
    String result = number % 2 == 0? "par":"ímpar";
    System.out.println(result);

    }
}