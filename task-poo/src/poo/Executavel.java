package poo;

import poo.Farmacia;
import poo.Estoque;
import poo.Endereco;
import poo.Remedio;
import poo.Laboratorio;

public class Executavel {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Rua dos Remedios", 100, "Paplhoça", "Santa Catarina", "Centro");
		Endereco endereco2 = new Endereco("Rua da Maldição", 200, "FLORIANÓPOLIS", "Santa Catarina", "ESTREITO");
		Endereco endereco3 = new Endereco("RUA JARDIM SILVA", 360, "FLORIANÓPOLIS", "Santa Catarina", "ESTREITO");

		Laboratorio  laboratorio1 = new Laboratorio("LEGRAND", "2.345.678/0001-11" ,endereco1); 
		
		Remedio rosuvas = new Remedio("ROSUVAS", 50.00,laboratorio1);
		Remedio glifage = new Remedio("GLIFAGE", 35.00,laboratorio1);
		Remedio aradois = new Remedio("ARADOIS", 50.00,laboratorio1);
		Remedio trandilax = new Remedio("TRANDILAX", 10.00,laboratorio1);
		

		Laboratorio  laboratorio2 = new Laboratorio("MEDLEY", "CNPJ12.345.678/0001-22",endereco2); 

		
		Remedio rosuvastatina = new Remedio("ROSUVASTATINA", 50.00,laboratorio2);
		Remedio lexotan = new Remedio("LEXOTAN", 40.00,laboratorio2);
		Remedio losartana = new Remedio("LOSARTANA", 45.00,laboratorio2);
		Remedio torsilax = new Remedio("TORSILAX", 15.00,laboratorio2);
		
		Remedio[] remedios = {rosuvas,glifage,aradois,trandilax,rosuvastatina,lexotan,losartana,torsilax};
		
		int[] quantidade = {4,3,2,1,1,2,3,4};
		
		Estoque est = new Estoque("LUCIANO", remedios,quantidade);
		Farmacia farmacia = new Farmacia("FARMÁCIA DO SENAC", "2.345.678/0001-33", endereco3,est);
		
		
		//INFORMAR O NOME DO RESPONSÁVEL PELO ESTOQUE;
		System.out.println("RESPONSÁVEL PELO ESTOQUE: " + farmacia.getRespEstoque());

		
		//CALCULAR O TOTAL (EM REAIS)DO ESTOQUE DE REMÉDIOS;
		System.out.println("VALOR TOTAL EM ESTOQUE: " + "R$ " +  est.valorTotal() );

		//CALCULAR O TOTAL (EM REAIS)DO POR LABORATÓRIO;
		System.out.println("VALOR TOTAL EM ESTOQUE " + "R$ " +  est.valorTotal("MEDLEY"));

		//INFORMAÇÕES SOBRE O LABORATORIO;
		System.out.println("INFO SOBRE O LABORATÓRIO: " + laboratorio1.toString());

	}

}
