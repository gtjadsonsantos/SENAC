package poo;

import java.util.Arrays;

public class Estoque {
	private String responsavel;
	private Remedio[] remedios;
	private int[] quantidade;
	private double total ;
	
	public Estoque(){}
	
	public Estoque(String responsavel, Remedio[] remedios, int[] quantidade) {
		super();
		this.responsavel = responsavel;
		this.remedios = remedios;
		this.quantidade = quantidade;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Remedio[] getRemedio() {
		return remedios;
	}
	public void setRemedio(Remedio[] remedio) {
		this.remedios = remedio;
	}

	public int[] getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int[] quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotal() {	
			for (int i = 0; i < quantidade.length; i++) {
				total = total + remedios[i].getPreco() * quantidade[i];
			}
		return total;
	}
	
	
	public double valorTotal(String nomeLaboratorio) {	
		
		for (int i = 0; i < quantidade.length; i++) {
			
			total = remedios[0].getLaboratorio().getNome().equals(nomeLaboratorio) ? 
					total + remedios[i].getPreco() * quantidade[i]
					: 
					total + 0;
		}
	return total;
}

	@Override
	public String toString() {
		return "Estoque [responsavel=" + responsavel + ", remedios=" + Arrays.toString(remedios) + ", quantidade="
				+ Arrays.toString(quantidade) + ", total=" + total + "]";
	}
	
	
	
	
}
