package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import controllers.ControladorReceita;
import model.vo.ReceitaVO;


public class MenuReceita {
	
	Scanner teclado = new Scanner(System.in);
	DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private static final int OPCAO_MENU_CADASTRAR_RECEITA = 1;
	private static final int OPCAO_MENU_CONSULTAR_RECEITA = 2;
	private static final int OPCAO_MENU_ATUALIZAR_RECEITA = 3;
	private static final int OPCAO_MENU_EXCLUIR_RECEITA = 4;
	private static final int OPCAO_MENU_RECEITA_VOLTAR = 5;

	
	private static final int OPCAO_MENU_CONSULTAR_TODAS_RECEITA = 1;
	private static final int OPCAO_MENU_CONSULTAR_UMA_RECEITA = 2;
	private static final int OPCAO_MENU_CONSULTAR_RECEITA_VOLTAR = 3;
	

	public void apresentarMenuReceita() {
				
	int opcao = this.apresentarMenuOpcoesMenu();
		
		while(opcao != OPCAO_MENU_RECEITA_VOLTAR ) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_RECEITA:{
				this.cadastrarReceita();
				break;
			}
			case OPCAO_MENU_CONSULTAR_RECEITA:{
				this.consultarReceita();
				break;
			}
			case OPCAO_MENU_ATUALIZAR_RECEITA:{
				this.atualizarReceita();
				break;
			}
			case OPCAO_MENU_EXCLUIR_RECEITA:{
				this.excluirReceita();
				break;
				}
			default:{
				System.out.println("\nOpção inválida");
				break;
				}
			}

			opcao = this.apresentarMenuOpcoesMenu();

		}
		
		
	}

	private void consultarReceita() {
		int opcao = this.apresentarOpcoesConsulta();
		
		ControladorReceita constroladorReceita = new ControladorReceita();

		while (opcao != OPCAO_MENU_CONSULTAR_RECEITA_VOLTAR ) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_TODAS_RECEITA:{
				opcao = OPCAO_MENU_CONSULTAR_RECEITA_VOLTAR;
				
				ArrayList<ReceitaVO> listaReceitasVO = constroladorReceita.consultarTodasReceitasController();
				
				System.out.print("\n ---------- RESULTADO DA CONSULTA ------------");
				System.out.printf("\n%3s %-40s %-15s %-15s %-15s \n","IDRECEITA","IDUSUARIO","DESCRICAO","VALOR","DATARECEITA");

				for (int i = 0; i < listaReceitasVO.size(); i++) {
					
					listaReceitasVO.get(i).imprimir();
					
				}
				
				break;
			}
			case OPCAO_MENU_CONSULTAR_UMA_RECEITA:{
				opcao = OPCAO_MENU_CONSULTAR_RECEITA_VOLTAR;
				
				ReceitaVO receitaVO = new ReceitaVO();
				
				System.out.println("\n Informe o código da receita");				
				receitaVO.setId(Integer.parseInt(teclado.nextLine()));
		
				ReceitaVO receita = constroladorReceita.consultarReceitaController(receitaVO);
				
				System.out.print("\n ---------- RESULTADO DA CONSULTA ------------");
				System.out.printf("\n%3s %-40s %-15s %-15s %-15s \n","IDRECEITA","IDUSUARIO","DESCRICAO","VALOR","DATARECEITA");

				receita.imprimir();
				
				break;
			}
			default:
				System.out.println("Opcao Inválida");
				opcao = this.apresentarOpcoesConsulta();
			}
			
		}
	}

	private int apresentarOpcoesConsulta() {
		System.out.println("\nInforme o tipo de consulta a ser realizada");
		System.out.println(OPCAO_MENU_CONSULTAR_TODAS_RECEITA + " CONSULTAR TODAS AS RECEITAS"); 
		System.out.println(OPCAO_MENU_CONSULTAR_UMA_RECEITA + " COSULTAR UMA RECEITA");
		System.out.println(OPCAO_MENU_CONSULTAR_RECEITA_VOLTAR + " VOLTAR");
		System.out.println("\n Digite a opção: ");
		
		return Integer.parseInt(teclado.nextLine());
	}

	private void atualizarReceita() {
		ReceitaVO receitaVO = new ReceitaVO();
		
		System.out.println("Informe o ID da receita");
		receitaVO.setId(Integer.parseInt(teclado.nextLine()));
		System.out.println("\n Informe o ID do usuario");
		receitaVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		System.out.println("\nInforme a descrição da receita");
		receitaVO.setDescricao(teclado.nextLine());
		System.out.println("\nInforme o valor da receita");
		receitaVO.setValor(Double.parseDouble(teclado.nextLine()));
		System.out.println("\n Informe a data da receita");
		receitaVO.setDataReceita(LocalDate.parse(teclado.nextLine(),dataFormatter));
		
		ControladorReceita constroladorReceita = new ControladorReceita();
		
		constroladorReceita.atualizarReceita(receitaVO);
		
	}

	private void excluirReceita() {
		ReceitaVO receitaVO = new ReceitaVO();

		System.out.println("Inform o código da Receita");
		receitaVO.setId(Integer.parseInt(teclado.nextLine()));
		
		ControladorReceita constroladorReceita = new ControladorReceita();
		
		constroladorReceita.exlcuirReceita(receitaVO);
		
	}

	private void cadastrarReceita() {
		ReceitaVO receitaVO = new ReceitaVO();
		
		
		System.out.println("\n Informe o ID do usuario");
		receitaVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		System.out.println("\nInforme a descrição da receita");
		receitaVO.setDescricao(teclado.nextLine());
		System.out.println("\nInforme o valor da receita");
		receitaVO.setValor(Double.parseDouble(teclado.nextLine()));
		System.out.println("\n Informe a data da receita");
		receitaVO.setDataReceita(LocalDate.parse(teclado.nextLine(),dataFormatter));
		
		ControladorReceita constroladorReceita = new ControladorReceita();
		
		constroladorReceita.cadastrarReceita(receitaVO);
		
		
		
	}

	private int  apresentarMenuOpcoesMenu() {
		System.out.println("\nControle de Gastos \n-------- Menu Cadastro --------");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_CADASTRAR_RECEITA + " - Cadastrar Receita");
		System.out.println(OPCAO_MENU_CONSULTAR_RECEITA + " - Consultar Receita");
		System.out.println(OPCAO_MENU_ATUALIZAR_RECEITA + "- Atualizar Receita");	
		System.out.println(OPCAO_MENU_EXCLUIR_RECEITA + "- Excluir Receita");	
		System.out.println(OPCAO_MENU_RECEITA_VOLTAR + "- Voltar");	

 		return  Integer.parseInt(teclado.nextLine());

	}

}
