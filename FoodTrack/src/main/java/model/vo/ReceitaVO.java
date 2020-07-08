package model.vo;

import java.time.LocalDate;

public class ReceitaVO extends LancamentoVO {
	
	private LocalDate dataReceita;

	public ReceitaVO(int id, int idUsuario, String descricao, double valor, LocalDate dataReceita) {
		super(id, idUsuario, descricao, valor);
		this.dataReceita = dataReceita;
	}

	public ReceitaVO() {
		super();
	}

	public LocalDate getDataReceita() {
		return dataReceita;
	}

	public void setDataReceita(LocalDate dataReceita) {
		this.dataReceita = dataReceita;
	}

	public void imprimir() {
		System.out.printf("\n%3s %-40s %-15s %-15s %-15s \n",this.getId(),this.getIdUsuario(),this.getDescricao(),this.getValor(),this.getDataReceita());
		
	}
	
	
	
	
	
	
	
}
