package view;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ControladorUsuario;
import model.vo.UsuarioVO;


public class MenuUsuario {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CADASTRAR_USUARIO = 1;
	private static final int OPCAO_MENU_CONSULTAR_USUARIO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_USUARIO = 3;
	private static final int OPCAO_MENU_EXCLUIR_USUARIO = 4;
	private static final int OPCAO_MENU_USUARIO_VOLTAR = 5;

	private static final int OPCAO_MENU_CONSULTAR_TODOS_USUARIOS = 1;
	private static final int OPCAO_MENU_CONSULTAR_UM_USUARIOS = 2;
	private static final int OPCAO_MENU_CONSULTAR_USUARIOS_VOLTAR = 3;



	public void apresentarMenuUsuario() {
				
		int opcao = this.apresentarMenuOpcoesMenu();
		
		while(opcao != OPCAO_MENU_USUARIO_VOLTAR ) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_USUARIO:{
				this.cadastrarUsuario();
				break;
			}
			case OPCAO_MENU_CONSULTAR_USUARIO:{
				this.consultarUsuario();
				break;
			}
			case OPCAO_MENU_ATUALIZAR_USUARIO:{
				this.atualizarUsuario();
				break;
			}
			case OPCAO_MENU_EXCLUIR_USUARIO:{
				this.excluirUsuario();
				break;
				}
			default:{
				System.out.println("\n Opção Inválida");
				}
			}

			opcao = this.apresentarMenuOpcoesMenu();

		}
		
	}
	
	private void consultarUsuario() {
		int opcao = this.apresentarOpcoesConsulta();
		
		ControladorUsuario controladorUsuario = new ControladorUsuario();
		
		while(opcao != OPCAO_MENU_CONSULTAR_USUARIOS_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_TODOS_USUARIOS: {
				opcao = OPCAO_MENU_CONSULTAR_USUARIOS_VOLTAR;
					ArrayList<UsuarioVO> listaUsuariosVO = controladorUsuario.consultarTodosUsuariosController();
					
					System.out.print("\n ---------- RESULTADO DA CONSULTA ------------");
					System.out.printf("\n%3s %-40s %-15s %-15s \n", "ID", "NOME", "CPF","TELEFONE");
					
					for (int i = 0; i < listaUsuariosVO.size(); i++) {
						listaUsuariosVO.get(i).imprimir();
					}
					
				break;
			}
			case OPCAO_MENU_CONSULTAR_UM_USUARIOS:{
				opcao = OPCAO_MENU_CONSULTAR_USUARIOS_VOLTAR;
				
				UsuarioVO usuarioVO = new UsuarioVO();
				
				System.out.println("Informe o código do usuario: ");
				usuarioVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		
				UsuarioVO usuario = controladorUsuario.consultarUsuarioController(usuarioVO);
				System.out.print("\n ---------- RESULTADO DA CONSULTA ------------");
				System.out.printf("\n%3s %-40s %-15s %-15s \n", "ID", "NOME", "CPF","TELEFONE");

				usuario.imprimir();
				
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
		System.out.println(OPCAO_MENU_CONSULTAR_TODOS_USUARIOS + " CONSULTAR TODOS OS USUARIOS"); 
		System.out.println(OPCAO_MENU_CONSULTAR_UM_USUARIOS + " COSULTAR UM USUARIO");
		System.out.println(OPCAO_MENU_CONSULTAR_USUARIOS_VOLTAR + " VOLTAR");
		System.out.println("\n Digite a opção: ");
		
		return Integer.parseInt(teclado.nextLine());
	}

	private void excluirUsuario() {
		UsuarioVO usuarioVO = new UsuarioVO();
		
		System.out.println("Informe o código do usuario: ");
		usuarioVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		
		ControladorUsuario cotroloadorUsuario = new ControladorUsuario();
		cotroloadorUsuario.excluirUsuarioController(usuarioVO);
		
	}

	private void atualizarUsuario() {
		UsuarioVO usuarioVO = new UsuarioVO();
		
		System.out.println("Informe o código do usuario: ");
		usuarioVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		System.out.println("Informe o nome do usuario: ");
		usuarioVO.setNome(teclado.nextLine());
		System.out.println("Informe o cpf do usuario: ");
		usuarioVO.setCpf(teclado.nextLine());
		System.out.println("Informe o telefone do usuario: ");
		usuarioVO.setTelefone(teclado.nextLine());
		System.out.println("Informe o login do usuario: ");
		usuarioVO.setLogin(teclado.nextLine());
		System.out.println("Informe o senha do usuario: ");
		usuarioVO.setSenha(teclado.nextLine());
		
		ControladorUsuario cotroloadorUsuario = new ControladorUsuario();
		cotroloadorUsuario.atualizarUsuarioController(usuarioVO);
	}

	private void cadastrarUsuario() {
		UsuarioVO usuarioVO = new UsuarioVO();
		
		System.out.println("Informe o nome do usuario: ");
		usuarioVO.setNome(teclado.nextLine());
		System.out.println("Informe o cpf do usuario: ");
		usuarioVO.setCpf(teclado.nextLine());
		System.out.println("Informe o telefone do usuario: ");
		usuarioVO.setTelefone(teclado.nextLine());
		System.out.println("Informe o login do usuario: ");
		usuarioVO.setLogin(teclado.nextLine());
		System.out.println("Informe o senha do usuario: ");
		usuarioVO.setSenha(teclado.nextLine());
		
		ControladorUsuario cotroladorUsuario = new ControladorUsuario();
		cotroladorUsuario.cadastrarUsuarioController(usuarioVO);
	}	

	private int  apresentarMenuOpcoesMenu() {
		System.out.println("\nControle de Gastos \n-------- Menu Cadastro --------");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_CADASTRAR_USUARIO + " - Cadastrar Usuário");
		System.out.println(OPCAO_MENU_CONSULTAR_USUARIO + " - Consultar Usuario");
		System.out.println(OPCAO_MENU_ATUALIZAR_USUARIO + "- Atualizar Usuario");	
		System.out.println(OPCAO_MENU_EXCLUIR_USUARIO + "- Excluir Usuario");	
		System.out.println(OPCAO_MENU_USUARIO_VOLTAR + "- Voltar");	

 		return  Integer.parseInt(teclado.nextLine());

	}

}
