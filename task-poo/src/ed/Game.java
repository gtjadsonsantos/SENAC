package ed;

import java.util.Random;
import java.util.Scanner;

public class Game {
	 public int numero;
	 
	 public Game(){}
	
	
	
	public Game(int numero) {
		this.numero = numero;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public static void main(String[] args) {
		
		Random sorteia = new Random();
		
		Game jogo = new Game(sorteia.nextInt(9) * 1);
		Scanner keyboard = new Scanner(System.in);
		
		int status = 0;
		int input ;
		
		for (int i = 0; i <= 20; i++) {
				
			System.out.println("Tente a sorte, qual o número foi sorteado ?");
			input =  keyboard.nextInt();
			
			
			if(jogo.getNumero() == input) {
				status = 1;
				System.out.println("Acertou");
				System.out.println("Como você acertou, o jogo acabou!");
				break;
			}else {
				System.out.println("Errou");
				
				if(input < jogo.getNumero() ) {
					System.out.println("Menor");
				}else {
					System.out.println("Maior");

				}

			}
			
			}
			
		}
	
			
	

}



/*
Faça um jogo no qual será gerado um número  aleatório entre 1 e 10000.
O usuário poderá chutar até 20 vezes
Caso ele chute um número menor que o gerado  aleatóriamente, imprima “é um número MAIOR”, se  ele digitar um maior imprima “é um número  MENOR”.
Quando ele acertar, uma mensagem de  PARABÉNS deve ser impressa
Caso ele não acerte em 20 tentativas imprima: Game over

*/