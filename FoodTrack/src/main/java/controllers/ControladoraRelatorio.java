package controllers;


import java.util.ArrayList;

import model.bo.RelatorioBO;
import model.dto.LancamentoUsuarioDTO;;

public class ControladoraRelatorio {
	
	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuarioController() {
		RelatorioBO relatorioBO = new RelatorioBO();
		
		return relatorioBO.gerarRelatorioTotalDespesasUsuarioBO();
	}


	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalReceitasUsuarioController() {
		 RelatorioBO relatorioBO = new RelatorioBO();
		
		return relatorioBO.gerarRelatorioTotalReceitasUsuarioBO();
	}


	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalReceitasUsuarioPorPeriodoController( LancamentoUsuarioDTO lancamentoUsuarioDTO) {
		 RelatorioBO relatorioBO = new RelatorioBO();
			
		return relatorioBO.gerarRelatorioTotalReceitasUsuarioPorPeriodoBO(lancamentoUsuarioDTO);
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuariosPorPeriodoController( LancamentoUsuarioDTO lancamentoUsuarioDTO) {
		 RelatorioBO relatorioBO = new RelatorioBO();
			
		return relatorioBO.gerarRelatorioTotalDespesasUsuariosPorPeriodoBO(lancamentoUsuarioDTO);
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodoController() {
		 	RelatorioBO relatorioBO = new RelatorioBO();
			
			return relatorioBO.gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodoBO();
	}



}
