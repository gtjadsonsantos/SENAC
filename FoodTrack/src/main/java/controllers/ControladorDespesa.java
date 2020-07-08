package controllers;

import java.util.ArrayList;

import model.bo.DespesaBO;
import model.vo.DespesaVO;

public class ControladorDespesa {

	public void cadastrarDespesaController(DespesaVO despesaVO) {
		DespesaBO despesaBO = new DespesaBO();
		
		despesaBO.cadastrarDespesaBO(despesaVO);
	}

	public void excluirDespesaController(DespesaVO despesaVO) {
		DespesaBO despesaBO = new DespesaBO();

		despesaBO.excluirDespesaBO(despesaVO);

	}

	public void atualizarDespesaController(DespesaVO despesaVO) {
		DespesaBO despesaBO = new DespesaBO();

		despesaBO.atualizarDespesaBO(despesaVO);

	}
	
	public ArrayList<DespesaVO> consultarTodasDespesaController() {
		DespesaBO despesaBO = new DespesaBO();

		return despesaBO.consultarTodasDespesaSBO();

	}

	public DespesaVO consultarDespesaController(DespesaVO despesaVO) {
		DespesaBO despesaBO = new DespesaBO();

		return despesaBO.consultarDespesaBO(despesaVO);

	}
}
