package model.bo;

import java.util.ArrayList;

import model.dao.RelatorioDAO;
import model.dto.LancamentoUsuarioDTO;

public class RelatorioBO {

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuarioBO() {
		RelatorioDAO relatorioDAO = new RelatorioDAO();
		
		ArrayList<LancamentoUsuarioDTO>  listaLancamentoUsuarioDTO =  relatorioDAO.gerarRelatorioTotalDespesasUsuarioDAO();
		
		if(listaLancamentoUsuarioDTO.isEmpty()) {
			System.out.println("\n Lista de lamcamento de despesas do usuario está vazia");
		}
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalReceitasUsuarioBO() {
		RelatorioDAO relatorioDAO = new RelatorioDAO();
		
		ArrayList<LancamentoUsuarioDTO>  listaLancamentoUsuarioDTO =  relatorioDAO.gerarRelatorioTotalReceitasUsuarioDAO();
		
		if(listaLancamentoUsuarioDTO.isEmpty()) {
			System.out.println("\n Lista de lamcamento de receitas do usuario está vazia");
		}
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalReceitasUsuarioPorPeriodoBO(LancamentoUsuarioDTO lancamentoUsuarioDTO) {
		RelatorioDAO relatorioDAO = new RelatorioDAO();
		
		ArrayList<LancamentoUsuarioDTO>  listaLancamentoUsuarioDTO =  relatorioDAO.gerarRelatorioTotalReceitasUsuarioPorPeriodoDAO(lancamentoUsuarioDTO);
		
		if(listaLancamentoUsuarioDTO.isEmpty()) {
			System.out.println("\n Lista de lamcamento de receitas do usuario por período está vazia");
		}
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuariosPorPeriodoBO(LancamentoUsuarioDTO lancamentoUsuarioDTO) {
		
		RelatorioDAO relatorioDAO = new RelatorioDAO();
		
		ArrayList<LancamentoUsuarioDTO>  listaLancamentoUsuarioDTO =  relatorioDAO.gerarRelatorioTotalDespesasUsuariosPorPeriodoDAO(lancamentoUsuarioDTO);
		
		if(listaLancamentoUsuarioDTO.isEmpty()) {
			System.out.println("\n Lista de lamcamento de despesas do usuario por período está vazia");
		}
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodoBO() {
		RelatorioDAO relatorioDAO = new RelatorioDAO();
		
		ArrayList<LancamentoUsuarioDTO>  listaLancamentoUsuarioDTO =  relatorioDAO.gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodoDAO();
		
		if(listaLancamentoUsuarioDTO.isEmpty()) {
			System.out.println("\n Lista de lamcamento de despesas do usuario abertas por período está vazia");
		}
		
		return listaLancamentoUsuarioDTO;
	}

}
