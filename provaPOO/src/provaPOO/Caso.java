package provaPOO;

public class Caso {
	private Paciente paciente;
	private Medico medico;
	private Enfermeiro enfermeiro;
	private Doenca doenca;
	
	public Caso() {
		
	}

	public Caso(Paciente paciente, Medico medico, Enfermeiro enfermeiro, Doenca doenca) {
		this.paciente = paciente;
		this.medico = medico;
		this.enfermeiro = enfermeiro;
		this.doenca = doenca;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}
	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}
	public Doenca getDoeca() {
		return doenca;
	}
	public void setDoeca(Doenca doenca) {
		this.doenca = doenca;
	}
	
	
	
}
