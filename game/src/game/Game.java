package game;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Game {
	
	 public int numero;
	 private Jogador[] jogadores;
	 
	 public static final String INICIO = "BEM VINDO AO GAME RANDOM NUMBER";
	 public static final String JOGADORES = "CADASTRO DOS JOGADORES, QUANTOS IRÃO JOGAR ?";
	 public static final String PERGUNTA = "QUAL O NÚMERO FOI SORTEADOR ?";
	 public static final String ERRADO = "NÚMERO INFORMADO, NÃO BATE COM O NÚMERO SORTEADO";
	 public static final String FIMJOGO = "O JOGO ACABOU";
	 public static final int CHANCES = 2;


	 public Game(){}
	 
	public Game(int numero, Jogador[] jogadores) {
		this.numero = numero;
		this.jogadores = jogadores;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	
	}
	
	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	public void startGame() {
		
		Scanner teclado = new Scanner(System.in);
				
        JOptionPane.showMessageDialog(null,INICIO);
        
		boolean endgame = false;
		
		while(endgame == false ) {
			
			for (int i = 0; i < jogadores.length; i++) {
				
				for (int j = 0; j <= CHANCES; j++) {
					
					System.out.println("JOGADOR: " + jogadores[i].getNome() + ","+ PERGUNTA);
					
										 		  
					int entradaJogador  =  Integer.parseInt(JOptionPane.showInputDialog("JOGADOR: " + jogadores[i].getNome() + ","+ PERGUNTA));
					
					System.out.println(entradaJogador);
					
					
					if(entradaJogador == numero ) {
						System.out.println("PARABÉNS JOGADOR, " + jogadores[i].getNome() + " VOCÊ GANHOU O JOGO");
						endgame = true;
						break;
					}else {
						System.out.println(ERRADO);
					}
					
				}
				
				if(endgame == true ) {
					break;
				}
			}	
						
			JOptionPane.showMessageDialog(null, FIMJOGO);
			endgame = true;
		}
	}
}
