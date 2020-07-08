package src;

 

import java.util.ArrayList;
import java.util.Random;
import model.Jogador;
import javax.swing.JOptionPane;


public class JogoAdivinhacaoCodigoProfessor {
	
	// Lista Encadeada com os n jogadores e seus atributos
  static	ArrayList<Jogador> jogadores = new ArrayList();
	
	// objeto jogador para ser inserido na lista
  static Jogador jogador = new Jogador();
	
	
	
	
    
    public static final String MENSAGEM_BEM_VINDO = "Bem vindo Ao Game Adivinhation!";
    public static final String MENSAGEM_INICIAL = "O intuito deste jogo é tentar " + "acertar nas "
            + JogoAdivinhacaoCodigoProfessor.NUMERO_TENTATIVAS + " chances o número aleatório que foi gerado no início da partida";
    public static final String MENSAGEM_MAIOR = "Você errou! O número em questão é maior";
    public static final String MENSAGEM_MENOR = "Você errou! O número em questão é menor";
    public static final String MENSAGEM_ACERTO = "Ah mizeravi, asertô!";
    public static final String MENSAGEM_OVER = "Ah, que pena, você perdeu.";
    public static final int NUMERO_TENTATIVAS = 20;
    public static final int NUMERO_CONTINUES = 3;
    public static final long MULTIPLICADOR_PONTOS = 100;
    

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // mensagem de apresentação do game
        JOptionPane.showMessageDialog(null, JogoAdivinhacaoCodigoProfessor.MENSAGEM_BEM_VINDO);

 


        // gerador de número aleatório entre 1 e 10 k
        Random numero = new Random();
        int gerado = 1 + numero.nextInt(10000);
        System.out.println("o numero gerado foi: " + gerado);

 


        // flag que irá iniciar ou não a partida
        int inicio = 2;
        //quantidade de partidas permitidas
        int continues = JogoAdivinhacaoCodigoProfessor.NUMERO_CONTINUES;
        
        //variável que conterá a quantidade de jogadores na partida
        int gamers = Integer.parseInt(JOptionPane.showInputDialog("Tudo certo? Deseja iniciar a partida agora?" + "\n1-Sim" + "\n2-Não"));
        
        // interação para popular os objetos para popular a lista
        for (int i = 1; i <= gamers; i++) {
        	jogador = new Jogador();
        	
        	jogador.setNome(JOptionPane.showInputDialog("Qual o seu nome jogador" + i));
        	jogador.setContinues(continues);
        	jogador.setTentativas(JogoAdivinhacaoCodigoProfessor.NUMERO_TENTATIVAS);
        	jogador.setPontuacao(0);
        	
        	jogadores.add(jogador);
        	
        	//Para em 02:35:10
        	
		}

        // contador de tentativas utilizadas
        int tentativasRestantes = JogoAdivinhacaoCodigoProfessor.NUMERO_TENTATIVAS;
        
        // condicional para iniciar ou não
        while (inicio == 2) {
            // mensagem inicial de instruções
            JOptionPane.showMessageDialog(null, JogoAdivinhacaoCodigoProfessor.MENSAGEM_INICIAL);

 


            // pergunta para iniciar ou rever as instruções
            inicio = Integer.parseInt(
                    JOptionPane.showInputDialog("Tudo certo? Deseja iniciar a partida agora?" + "\n1-Sim" + "\n2-Não"));
        }
        long pontosAtuais=0;
        //enquanto ele tiver um ou mais continues
        while (continues > 0) {

 


            for (int i = 1; i <= JogoAdivinhacaoCodigoProfessor.NUMERO_TENTATIVAS; i++) {
                tentativasRestantes = tentativasRestantes - 1;
                 pontosAtuais = (JogoAdivinhacaoCodigoProfessor.MULTIPLICADOR_PONTOS * tentativasRestantes)/i ;
                
                // introdução do número digitado pelo usuário
                int digitado = Integer
                        .parseInt(JOptionPane.showInputDialog("Favor, Qual número achas que foi sorteado?"));

 


                // validação seu o numero digitado é igual ao sorteado
                if (digitado == gerado) {
                    JOptionPane.showMessageDialog(null,
                            JogoAdivinhacaoCodigoProfessor.MENSAGEM_ACERTO + "\n Você acertou na " + i + " tentativa\n"
                                    + "Sua pontuação foi: "+pontosAtuais);
                    // condição para parar o laço de repetição
                    break;
                } else if (i == JogoAdivinhacaoCodigoProfessor.NUMERO_TENTATIVAS) {
                    JOptionPane.showMessageDialog(null, JogoAdivinhacaoCodigoProfessor.MENSAGEM_OVER+"\n"
                            + "Sua pontuação foi: "+pontosAtuais);
                    break;
                }

 


                // validação se o número digitado é menor que o numero gerado.
                // Obs: só cairá nesse laço caso o if não seja atendido
                else if (digitado < gerado) {

 


                    JOptionPane.showMessageDialog(null, JogoAdivinhacaoCodigoProfessor.MENSAGEM_MAIOR + ""
                            + "\nNúmero de tentativas disponíveis: " + tentativasRestantes);

 


                }

 


                // validação se o número digitado é maior que o numero gerado.
                // Obs: só cairá nesse laço caso o if não seja atendido
                else if (digitado > gerado) {

 


                    JOptionPane.showMessageDialog(null, JogoAdivinhacaoCodigoProfessor.MENSAGEM_MENOR + ""
                            + "\nNúmero de tentativas disponíveis: " + tentativasRestantes);

 


                }

 


            }      
            
            //pergunta caso o jogador queira continuar
            int continuarGame = Integer.parseInt(JOptionPane.showInputDialog("GAME OVER. Deseja continuar?\n1-Sim"
                    + "\n2-Não." + "\n Numero de continues disponpiveis: " + continues+"\n"+ 
                    "Sua pontuação foi: "+pontosAtuais));
            
            //se ele deseja continuar e tiver continues
            if (continuarGame == 1 && continues > 0) {
                //tira um continue dele
                continues--;
                
            } 
            //se deseja continuar e não tem continues
            else if (continuarGame == 1 && continues == 0) {
                JOptionPane.showMessageDialog(null, "Ah, que pena, seus créditos acabaram. Até a próxima");
            } 
            //se não deseja continuar
            else if (continuarGame == 2) {
                JOptionPane.showMessageDialog(null, "Tudo bem, até a próxima!");
                continues = 0;
            } else {
                //se for algo diferente
                continues = 0;
            }
        }

 

    }
    
}