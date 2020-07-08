package controllers;

import java.util.ArrayList;

import model.bo.ReceitaBO;
import model.vo.ReceitaVO;

public class ControladorReceita {


	public void cadastrarReceita(ReceitaVO receitaVO) {
		ReceitaBO receitaBO = new ReceitaBO();
		
		receitaBO.cadastraReceita(receitaVO);
		
	}

	public void exlcuirReceita(ReceitaVO receitaVO) {
		ReceitaBO receitaBO = new ReceitaBO();
		
		receitaBO.excluirReceita(receitaVO);

	}
	

	public void atualizarReceita(ReceitaVO receitaVO) {
		ReceitaBO receitaBO = new ReceitaBO();
		
		receitaBO.atualizarReceita(receitaVO);

	}
	
	public ArrayList<ReceitaVO> consultarTodasReceitasController() {
		ReceitaBO receitaBO = new ReceitaBO();
		
		return receitaBO.consultarTodasReceitaBO();

	}

	public ReceitaVO consultarReceitaController(ReceitaVO receitaVO) {
		ReceitaBO receitaBO = new ReceitaBO();
		
		return receitaBO.consultarReceitaBO(receitaVO);
	}

}
