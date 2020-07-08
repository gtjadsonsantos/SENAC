package poo;

public class Farmacia extends Empresa {
	private Endereco endereco;
	private Estoque estoque;
	
	public Farmacia() {
		
	}
	
	public Farmacia(String nome, String cnpj,Endereco endereco, Estoque estoque) {
		super(nome,cnpj,endereco);
		this.estoque = estoque;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	public Endereco getEstoque() {
		return this.endereco;
	}
	
	public String getRespEstoque() {
		return this.estoque.getResponsavel(); 
	}
	@Override
	public String toString() {
		return "Farmacia [endereco=" + endereco + ", estoque=" + estoque + "]";
	}
	
	
	
	
}
