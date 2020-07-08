package poo;

public class Empresa {
	private String nome ;
	private String cnpj;
	private Endereco endereco;
	
	public Empresa() {}
	
	public Empresa(String nome, String cnpj,Endereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override 
	public String toString() {
			return "{" + "nome:" + this.nome + ", cnpj:" + this.cnpj + ", endereco:" + this.endereco + "}";				
	}
	
}
