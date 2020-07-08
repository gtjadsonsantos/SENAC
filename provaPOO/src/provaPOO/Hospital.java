package provaPOO;

public class Hospital {
	private String nome;
	private Endereco enderecoHospital;
	private Caso[] casos;

	public Hospital() {
		super();
	}

	public Hospital(String nome, Endereco enderecoHospital, Caso[] casos) {
		super();
		this.nome = nome;
		this.enderecoHospital = enderecoHospital;
		this.casos = casos;
	}

	public Caso[] getCasos() {
		return casos;
	}

	public void setCasos(Caso[] casos) {
		this.casos = casos;
	}

	public Endereco getEnderecoHospital() {
		return enderecoHospital;
	}

	public void setEnderecoHospital(Endereco enderecoHospital) {
		this.enderecoHospital = enderecoHospital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void buscaDoencasPacientes(String nome) {
		
		System.out.println("Lista de pacientes com " + nome);
		
		for (int i = 0; i < casos.length; i++) {
			
			if (casos[i].getDoeca().getNome() == nome) {
				
				System.out.println(casos[i].getPaciente().toString());
			}
			
		}
		System.out.println("\n\n\n");

	}
	
	public void buscaBairroPacientes(String nome) {
		
		System.out.println("Lista de pacientes que moram em " + nome );
		
		for (int i = 0; i < casos.length; i++) {
			if (casos[i].getPaciente().getEndereco().getBairro() == nome) {
				
				System.out.println(casos[i].getPaciente().toString());
			}
			
		}
		
		System.out.println("\n\n");
		
	}
	
}
