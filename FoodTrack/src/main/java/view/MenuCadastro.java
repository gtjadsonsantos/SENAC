package view;

import java.util.Scanner;

public class MenuCadastro {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CADASTRO_USUARIOS = 1;
	private static final int OPCAO_MENU_CADASTRO_RECEITAS = 2;
	private static final int OPCAO_MENU_CADASTRO_DESPESAS = 3;
	private static final int OPCAO_MENU_CADASTRO_SAIR = 4;
	
	public void apresentarMenuCadastro() {
		int opcao = this.apresentarOpcoesMenu();
		
		while(opcao != OPCAO_MENU_CADASTRO_SAIR) {
			
			switch (opcao) {
			case OPCAO_MENU_CADASTRO_USUARIOS:{
				MenuUsuario menuUsuario = new MenuUsuario();
				menuUsuario.apresentarMenuUsuario();
				
				break;
			}
			case OPCAO_MENU_CADASTRO_RECEITAS:{
				MenuReceita menuReceita = new MenuReceita();
				menuReceita.apresentarMenuReceita();
				
				break;
			}
			case OPCAO_MENU_CADASTRO_DESPESAS:{
				MenuDespesas menuDespesas = new MenuDespesas();
				menuDespesas.apresentarMenuDespesa();
				break;
			}
			default:{
				System.out.println("\nOpção Inválida.");
				}
			}
			
			opcao = this.apresentarOpcoesMenu();
		}
		
	}

	private int apresentarOpcoesMenu() {
		System.out.println("\nControle de Gastos \n-------- Menu Cadastro --------");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_CADASTRO_USUARIOS + " -  Usuários");
		System.out.println(OPCAO_MENU_CADASTRO_RECEITAS + " -  Receitas");
		System.out.println(OPCAO_MENU_CADASTRO_DESPESAS + "-   Despesas");
		System.out.println(OPCAO_MENU_CADASTRO_SAIR + "- Sair");
		
		
		return  Integer.parseInt(teclado.nextLine());

	}

}
