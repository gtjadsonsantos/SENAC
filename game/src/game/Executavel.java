package game;

import game.Jogador;

import java.util.Random;

import javax.swing.JOptionPane;

import game.Game;



public class Executavel {

	public static void main(String[] args) {
		
		Random sorteador = new Random() ;
		
		int numeroSorteado = sorteador.nextInt(10) * 2;
		
		int quantidadeJogadores = 0;
		
		quantidadeJogadores = Integer.parseInt(JOptionPane.showInputDialog(Game.JOGADORES));
		
		Jogador[] jogadores = new Jogador[quantidadeJogadores];

		
		
		System.out.println(numeroSorteado);
		for (int i = 0; i < jogadores.length; i++) {
			
			Jogador jogador = new Jogador(JOptionPane.showInputDialog("INFORME O NOME DO JOGADOR " + i + " : " ));
			
			jogadores[i] = jogador;
			
			
		}
	
		
		
		Game jogo = new Game(numeroSorteado,jogadores);
		
		jogo.startGame();

		
	}

}
