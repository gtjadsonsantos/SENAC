package model.bo;

import model.vo.UsuarioVO;

import java.util.ArrayList;

import model.dao.UsuarioDAO;

public class UsuarioBO {

	public void cadastrarUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		if(usuarioDAO.existeRegistroPorCpf(usuarioVO.getCpf())) {
			System.out.println("\n Usuário já cadastrado. ");
		}else {
			int resultado = usuarioDAO.cadastrarUsuarioDAO(usuarioVO);
			
			if(resultado == 1) {
				System.out.println("\n Usuario cadastrado com sucesso");
			}else {	
				System.out.println("\n Não possível cadastrar o usuario");
			}
		}	
		
	}

	public void atualizarUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		if(usuarioDAO.existeRegistroPorIdUsuario(usuarioVO.getIdUsuario())) {
			int resultado = usuarioDAO.atualizarUsuarioDAO(usuarioVO);
			
			if(resultado == 1 ) {
				System.out.println("\nUsuario atualizado com sucesso");
			}else {
				System.out.println("\nNão foi possível atualizar o usuario");
			}
		}else {
			System.out.println("Usuario ainda não foi cadastrado");
		}
	}

	public void excluirUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		if(usuarioDAO.existeRegistroPorIdUsuario(usuarioVO.getIdUsuario())) {
			
			int resultado = usuarioDAO.excluirUsuarioDAO(usuarioVO);
			
			if(resultado == 1) {
				System.out.println("Usuario excluido com suscesso");
			}else {
				System.out.println("Não foi possível excluir usuario");
			}
			
		}else {
			System.out.println("\nUsuário não existe na base de dados");
		}
		
	}

	public ArrayList<UsuarioVO> consultarTodosUsuariosBO() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		ArrayList<UsuarioVO> listaUsuariosVO = usuarioDAO.consultarTodosUsuariosDAO();
		
		if(listaUsuariosVO.isEmpty()) {
			System.out.println("\nLista de Usuarios  está vazia.");
		}
		
		return listaUsuariosVO;
	}

	public UsuarioVO consultarUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
				
		UsuarioVO usuario = usuarioDAO.consultarUsuarioDAO(usuarioVO);
	
		
		if(usuario == null) {
			
			System.out.println("\nUsuário não localizado.");
		}
			
		return usuario;
	}
	

		


}
