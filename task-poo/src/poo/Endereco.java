package poo;

public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String estado;
	private String bairro; 
	
	public Endereco() {}
	
	public Endereco(String rua, int numero, String cidade, String estado,String bairro) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override 
	public String toString() {
			return "{" + "rua:" + this.rua + ","
					+ " numero:" + this.numero + 
					", cidade:" + this.cidade + ", estado:" 
					 + this.estado + ", bairro:" + this.bairro ;				
	}
	
	
	
	
}
