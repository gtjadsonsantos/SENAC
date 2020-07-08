package model;

public class Jogador {
	private String nome ;
	private long pontuacao;
	private int tentativas;
	private int continues;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(long pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getTentativas() {
		return tentativas;
	}
	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}
	public int getContinues() {
		return continues;
	}
	public void setContinues(int continues) {
		this.continues = continues;
	}
	
	
}
