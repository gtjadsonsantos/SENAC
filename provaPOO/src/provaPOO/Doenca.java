package provaPOO;

public class Doenca {
	private String nome;
	private boolean tratavel; 
	private boolean transmissivel;
	
	public Doenca() {
		super();
	}

	public Doenca(String nome, boolean tratavel, boolean transmissivel) {
		super();
		this.nome = nome;
		this.tratavel = tratavel;
		this.transmissivel = transmissivel;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isTratavel() {
		return tratavel;
	}


	public void setTratavel(boolean tratavel) {
		this.tratavel = tratavel;
	}


	public boolean isTransmissivel() {
		return transmissivel;
	}


	public void setTransmissivel(boolean transmissivel) {
		this.transmissivel = transmissivel;
	}
	
	
	
	
	
	
}
