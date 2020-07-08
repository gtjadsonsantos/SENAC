package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import controllers.ControladoraRelatorio;
import model.dto.LancamentoUsuarioDTO;


public class MenuRelatorio {
	
	Scanner teclado = new Scanner(System.in);
	DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private static final int OPCAO_MENU_RELATORIO_TOTAL_RECEITAS_USUARIO = 1;
	private static final int OPCAO_MENU_RELATORIO_TOTAL_RECEITAS_USUARIO_POR_PERIODO = 2;
	private static final int OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO = 3;
	private static final int OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO_POR_PERIODO = 4;
	private static final int OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO_ABERTAS_POR_PERIODO = 5;
	private static final int OPCAO_MENU_RELATORIO_VOLTAR = 6;


	public void apresentarMenuRelatorio(){
				
	int opcao = this.apresentarMenuOpcoesMenu();
		
		while(opcao != OPCAO_MENU_RELATORIO_VOLTAR ) {
			switch (opcao) {
			case OPCAO_MENU_RELATORIO_TOTAL_RECEITAS_USUARIO:{
				this.gerarRelatorioTotalReceitasUsuario();
				break;
			}
			case OPCAO_MENU_RELATORIO_TOTAL_RECEITAS_USUARIO_POR_PERIODO:{
				this.gerarRelatorioTotalReceitasUsuarioPorPeriodo();
				break;
			}
			case OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO:{
				this.gerarRelatorioTotalDespesasUsuario();
				break;
			}
			case OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO_POR_PERIODO:{
				this.gerarRelatorioTotalDespesasUsuariosPorPeriodo();
				break;
				}
			case OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO_ABERTAS_POR_PERIODO:{
				this.gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodo();
				break;
				}
			default:{
				System.out.println("Opção Inválida");
				break;
				}
			}
			opcao = this.apresentarMenuOpcoesMenu();

		}
		
		
	}

	private void gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodo() {
		
		LancamentoUsuarioDTO lancamentoUsuarioDTO = new LancamentoUsuarioDTO();
		
		System.out.println("\nDigite a data de início do período da busca: ");
		lancamentoUsuarioDTO.setDataInicioPesquisa(LocalDate.parse(teclado.nextLine(),dataFormatter));
		 System.out.println("\nDigite a data de fim do periodo da busca:");
		lancamentoUsuarioDTO.setDataFimPesquisa(LocalDate.parse(teclado.nextLine(),dataFormatter));

		
			
		ControladoraRelatorio controladoraRelatorio = new ControladoraRelatorio();
		
		ArrayList<LancamentoUsuarioDTO> listaLancamentosUsuarioDTO = controladoraRelatorio.gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodoController();
	
		System.out.print("\n --------Relatório - total de despesas dos usuarios ----------");
		System.out.printf("\n%3s %-40s %10s \n","ID","NOME","TOTAL");
		
		for (int i = 0; i < listaLancamentosUsuarioDTO.size(); i++) {
			listaLancamentosUsuarioDTO.get(i).imprimir();
			
		}
		
	}

	private void gerarRelatorioTotalDespesasUsuariosPorPeriodo() {
		
		LancamentoUsuarioDTO lancamentoUsuarioDTO = new LancamentoUsuarioDTO();
		
		System.out.println("\nDigite a data de início do período da busca: ");
		lancamentoUsuarioDTO.setDataInicioPesquisa(LocalDate.parse(teclado.nextLine(),dataFormatter));
		 System.out.println("\nDigite a data de fim do periodo da busca:");
		lancamentoUsuarioDTO.setDataFimPesquisa(LocalDate.parse(teclado.nextLine(),dataFormatter));

		
			
		ControladoraRelatorio controladoraRelatorio = new ControladoraRelatorio();
		
		ArrayList<LancamentoUsuarioDTO> listaLancamentosUsuarioDTO = controladoraRelatorio.gerarRelatorioTotalDespesasUsuariosPorPeriodoController(lancamentoUsuarioDTO);
	
		System.out.print("\n --------Relatório - total de despesas dos usuarios ----------");
		System.out.printf("\n%3s %-40s %10s \n","ID","NOME","TOTAL");
		
		for (int i = 0; i < listaLancamentosUsuarioDTO.size(); i++) {
			listaLancamentosUsuarioDTO.get(i).imprimir();
			
		}
		
	}

	private void gerarRelatorioTotalDespesasUsuario() {
		ControladoraRelatorio controladoraRelatorio = new ControladoraRelatorio();
		
		ArrayList<LancamentoUsuarioDTO> listaLancamentosUsuarioDTO = controladoraRelatorio.gerarRelatorioTotalDespesasUsuarioController();
	
		System.out.print("\n --------Relatório - total de despesas dos usuarios ----------");
		System.out.printf("\n%3s %-40s %10s \n","ID","NOME","TOTAL");
		
		for (int i = 0; i < listaLancamentosUsuarioDTO.size(); i++) {
			listaLancamentosUsuarioDTO.get(i).imprimir();
			
		}
		
	}

	private void gerarRelatorioTotalReceitasUsuarioPorPeriodo() {
		LancamentoUsuarioDTO lancamentoUsuarioDTO = new LancamentoUsuarioDTO();
		
		System.out.println("\nDigite a data de início do período da busca: ");
		lancamentoUsuarioDTO.setDataInicioPesquisa(LocalDate.parse(teclado.nextLine(),dataFormatter));
		 System.out.println("\nDigite a data de fim do periodo da busca:");
		lancamentoUsuarioDTO.setDataFimPesquisa(LocalDate.parse(teclado.nextLine(),dataFormatter));

		
			
		ControladoraRelatorio controladoraRelatorio = new ControladoraRelatorio();
		
		ArrayList<LancamentoUsuarioDTO> listaLancamentosUsuarioDTO = controladoraRelatorio.gerarRelatorioTotalReceitasUsuarioPorPeriodoController(lancamentoUsuarioDTO);
	
		System.out.print("\n --------Relatório - total de Receitas dos usuarios ----------");
		System.out.printf("\n%3s %-40s %10s \n","ID","NOME","TOTAL");
		
		for (int i = 0; i < listaLancamentosUsuarioDTO.size(); i++) {
			listaLancamentosUsuarioDTO.get(i).imprimir();
			
		}
		
	}

	private void gerarRelatorioTotalReceitasUsuario() {
		ControladoraRelatorio controladoraRelatorio = new ControladoraRelatorio();
		
		ArrayList<LancamentoUsuarioDTO> listaLancamentosUsuarioDTO = controladoraRelatorio.gerarRelatorioTotalReceitasUsuarioController();
	
		System.out.print("\n --------Relatório - total de receitas dos usuarios ----------");
		System.out.printf("\n%3s %-40s %10s \n","ID","NOME","TOTAL");
		
		for (int i = 0; i < listaLancamentosUsuarioDTO.size(); i++) {
			listaLancamentosUsuarioDTO.get(i).imprimir();
			
		}
		
	}

	private int  apresentarMenuOpcoesMenu() {
		System.out.println("\nControle de Gastos \n-------- Menu Cadastro --------");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_RELATORIO_TOTAL_RECEITAS_USUARIO + " - RELATÓRIO - TOTAL_RECEITAS_USUARIO");
		System.out.println(OPCAO_MENU_RELATORIO_TOTAL_RECEITAS_USUARIO_POR_PERIODO + " - RELATÓRIO - TOTAL_RECEITAS_USUARIO_POR_PERIODO ");
		System.out.println(OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO + "- RELATÓRIO - TOTAL DESPESAS USUARIO");	
		System.out.println(OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO_POR_PERIODO + "- RELATÓRIO - TOTAL DESPESAS USUARIO POR PERIODO");	
		System.out.println(OPCAO_MENU_RELATORIO_TOTAL_DESPESAS_USUARIO_ABERTAS_POR_PERIODO + "- RELATÓRIO - TOTAL DESPESAS USUARIO ABERTAS POR PERIODO");	
		System.out.println(OPCAO_MENU_RELATORIO_VOLTAR + "- Voltar");	

 		return  Integer.parseInt(teclado.nextLine());

	}

}
