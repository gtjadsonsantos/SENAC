package poo;

public class Remedio {
	private String nome;
	private double preco;
	private Laboratorio laboratorio;
	
	public Remedio() { }
	
	public Remedio(String nome, double preco, Laboratorio laboratorio) {
		this.nome = nome;
		this.preco = preco;
		this.laboratorio = laboratorio;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	@Override
	public String toString() {
		return this.nome + " - " + this.preco + " + " + this.laboratorio;
	}
	
}
