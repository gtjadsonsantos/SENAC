package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import controllers.ControladorDespesa;
import model.vo.DespesaVO;


public class MenuDespesas {
	
	Scanner teclado = new Scanner(System.in);
	DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private static final int OPCAO_MENU_CADASTRAR_DESPESA = 1;
	private static final int OPCAO_MENU_CONSULTAR_DESPESA = 2;
	private static final int OPCAO_MENU_ATUALIZAR_DESPESA = 3;
	private static final int OPCAO_MENU_EXCLUIR_DESPESA = 4;
	private static final int OPCAO_MENU_DESPESAS_VOLTAR = 5;

	private static final int OPCAO_MENU_CONSULTAR_TODAS_DESPESAS = 1;
	private static final int OPCAO_MENU_CONSULTAR_UMA_DESPESA = 2;
	private static final int OPCAO_MENU_CONSULTAR_DESPESA_VOLTAR = 3;



	public void apresentarMenuDespesa() {
				
	int opcao = this.apresentarMenuOpcoesMenu();
		
		while(opcao != OPCAO_MENU_DESPESAS_VOLTAR ) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_DESPESA:{
				this.cadastrarDespesa();
				
				break;
			}
			case OPCAO_MENU_CONSULTAR_DESPESA:{
				this.consultarDespesa();
				break;
			}
			case OPCAO_MENU_ATUALIZAR_DESPESA:{
				this.atualizarDespesa();
				break;
			}
			case OPCAO_MENU_EXCLUIR_DESPESA:{
				this.excluirDespesa();
				break;
				}
			default:{
				System.out.println("\n Opção inválida");
				}
			}
			opcao = this.apresentarMenuOpcoesMenu();
		}
		
		
	}

	private void consultarDespesa() {
		
		int opcao = this.apresentarOpcoesConsulta();
		
		ControladorDespesa controladorDespesa = new ControladorDespesa();

		while (opcao != OPCAO_MENU_CONSULTAR_DESPESA_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_TODAS_DESPESAS:{
				opcao = OPCAO_MENU_CONSULTAR_DESPESA_VOLTAR;
				
				ArrayList<DespesaVO> listaDespesasVO = controladorDespesa.consultarTodasDespesaController();
				
				System.out.print("\n ---------- RESULTADO DA CONSULTA ------------");
				System.out.printf("\n%3s %-40s %-15s %-15s %-15s %-15s %-15s \n","IDDESPESA","IDUSUARIO","DESCRICAO","VALOR","DATAVENCIMENTO","DATAPAGAMENTO","CATEGORIA");

				
				for (int i = 0; i < listaDespesasVO.size(); i++) {
					
					listaDespesasVO.get(i).imprimir();
				}

				break;
			}
			case OPCAO_MENU_CONSULTAR_UMA_DESPESA:{
				
				opcao = OPCAO_MENU_CONSULTAR_DESPESA_VOLTAR;
				
				DespesaVO despesaVO = new DespesaVO();
				
				System.out.println("Infome o código da despesa");
				
				despesaVO.setId(Integer.parseInt(teclado.nextLine()));
				
				DespesaVO despesa = controladorDespesa.consultarDespesaController(despesaVO);
				
				System.out.print("\n ---------- RESULTADO DA CONSULTA ------------");
				System.out.printf("\n%3s %-40s %-15s %-15s %-15s %-15s %-15s \n","IDDESPESA","IDUSUARIO","DESCRICAO","VALOR","DATAVENCIMENTO","DATAPAGAMENTO","CATEGORIA");

				despesa.imprimir();
				
				break;
			}

			default:
				System.out.println("\n Opcão Inválida");
				opcao = this.apresentarOpcoesConsulta();
			}
		}
		
		
	}

	private int apresentarOpcoesConsulta() {

		System.out.println("\nInforme o tipo de consulta a ser realizada");
		System.out.println(OPCAO_MENU_CONSULTAR_TODAS_DESPESAS + " CONSULTAR TODAS AS DESPESAS"); 
		System.out.println(OPCAO_MENU_CONSULTAR_UMA_DESPESA + " COSULTAR UMA DESPESA");
		System.out.println(OPCAO_MENU_CONSULTAR_DESPESA_VOLTAR + " VOLTAR");
		System.out.println("\n Digite a opção: ");
		
		return Integer.parseInt(teclado.nextLine());
	}

	private void atualizarDespesa() {
		DespesaVO despesaVO = new DespesaVO();
		
		System.out.println("\n Digite o código da despesa:");
		despesaVO.setId(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("\n Digite o código do usuario :");
		despesaVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		
		
		System.out.println("\n Digite a descrição da despesa:");
		despesaVO.setDescricao(teclado.nextLine());
		
		System.out.println("\n Digite o valor da despesa:");
		despesaVO.setValor(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("\nDigite a data de vencimento da despesa:");
		despesaVO.setDataVencimento(LocalDate.parse(teclado.nextLine(),dataFormatter));
		
		System.out.println("\nDigite a data de pagamento da despesa:");
				
		despesaVO.setDataPagamento(LocalDate.parse(teclado.nextLine(),dataFormatter));

		
		System.out.println("\n Digite a categoria da despesa:");
		despesaVO.setCategoria(teclado.nextLine());

		ControladorDespesa controladorDespesa = new ControladorDespesa();
		
		controladorDespesa.atualizarDespesaController(despesaVO);
		
	}

	private void excluirDespesa() {
		DespesaVO despesaVO = new DespesaVO();
		System.out.println("Inform o código da Despesa");
		despesaVO.setId(Integer.parseInt(teclado.nextLine()));
		
		ControladorDespesa controladorDespesa = new ControladorDespesa();
		controladorDespesa.excluirDespesaController(despesaVO);
		
	}

	private void cadastrarDespesa() {
		DespesaVO despesaVO = new DespesaVO();
		
		System.out.println("\nInforme o ID do usuario");
		despesaVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("\n Digite a descrição da despesa:");
		despesaVO.setDescricao(teclado.nextLine());
		
		System.out.println("\n Digite o valor da despesa:");
		despesaVO.setValor(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("\nDigite a data de vencimento da despesa:");
		despesaVO.setDataVencimento(LocalDate.parse(teclado.nextLine(),dataFormatter));
		
		System.out.println("\nDigite a data de pagamento da despesa:");
		
		despesaVO.setDataPagamento(LocalDate.parse(teclado.nextLine(),dataFormatter));
		
		System.out.println("\n Digite a categoria da despesa:");
		despesaVO.setCategoria(teclado.nextLine());

		ControladorDespesa controladorDespesa = new ControladorDespesa();
		
		controladorDespesa.cadastrarDespesaController(despesaVO);
		
	}

	private int  apresentarMenuOpcoesMenu() {
		System.out.println("\nControle de Gastos \n-------- Menu Cadastro --------");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_CADASTRAR_DESPESA + " - Cadastrar Despesa");
		System.out.println(OPCAO_MENU_CONSULTAR_DESPESA + " - Consultar Despesa");
		System.out.println(OPCAO_MENU_ATUALIZAR_DESPESA + "- Atualizar Despesa");	
		System.out.println(OPCAO_MENU_EXCLUIR_DESPESA + "- Excluir Despesa");	
		System.out.println(OPCAO_MENU_DESPESAS_VOLTAR + "- Voltar");	

 		return  Integer.parseInt(teclado.nextLine());

	}

}
