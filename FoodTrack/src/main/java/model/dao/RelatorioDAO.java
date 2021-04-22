package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.dto.LancamentoUsuarioDTO;

public class RelatorioDAO {

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalReceitasUsuarioDAO() {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		ArrayList<LancamentoUsuarioDTO> listaLancamentoUsuarioDTO = new ArrayList<LancamentoUsuarioDTO>();
		String query = "SELECT USUARIO.IDUSUARIO as ID, USUARIO.NOME as USUARIO, sum(RECEITA.VALOR) as RECEITAS FROM USUARIO INNER JOIN RECEITA ON USUARIO.IDUSUARIO = RECEITA.IDUSUARIO GROUP BY USUARIO.IDUSUARIO";
		
		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				LancamentoUsuarioDTO lancamentoUsuario = new LancamentoUsuarioDTO();
				lancamentoUsuario.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				lancamentoUsuario.setNome(resultado.getString(2));
				lancamentoUsuario.setValor(Double.parseDouble(resultado.getString(3)));
				
				listaLancamentoUsuarioDTO.add(lancamentoUsuario);
			}	
		} catch (Exception e) {
			System.out.println("Erro ao executar a query do relatório total de receito dos usuarios.");
			System.out.println("Erro: " +  e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO>  gerarRelatorioTotalDespesasUsuarioDAO() {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		ArrayList<LancamentoUsuarioDTO> listaLancamentoUsuarioDTO = new ArrayList<LancamentoUsuarioDTO>();
		
		String query = "SELECT USUARIO.IDUSUARIO as ID, USUARIO.NOME as USUARIO, sum(DESPESA.VALOR) as DESPESAS FROM USUARIO INNER JOIN  DESPESA  ON USUARIO.IDUSUARIO = DESPESA.IDUSUARIO GROUP BY USUARIO.IDUSUARIO";

		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				LancamentoUsuarioDTO lancamentoUsuario = new LancamentoUsuarioDTO();
				lancamentoUsuario.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				lancamentoUsuario.setNome(resultado.getString(2));
				lancamentoUsuario.setValor(Double.parseDouble(resultado.getString(3)));
				
				listaLancamentoUsuarioDTO.add(lancamentoUsuario);
			}	
		} catch (Exception e) {
			System.out.println("Erro ao executar a query do relatório total de receito dos usuarios.");
			System.out.println("Erro: " +  e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalReceitasUsuarioPorPeriodoDAO( LancamentoUsuarioDTO lancamentoUsuarioDTO) {
		
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<LancamentoUsuarioDTO> listaLancamentoUsuarioDTO = new ArrayList<LancamentoUsuarioDTO>();
		
		String query = "SELECT USUARIO.IDUSUARIO as ID, USUARIO.NOME as USUARIO, sum(RECEITA.VALOR) as RECEITAS FROM USUARIO INNER JOIN RECEITA ON USUARIO.IDUSUARIO = RECEITA.IDUSUARIO WHERE " 
				+ "RECEITA.DATARECEITA >= '" + lancamentoUsuarioDTO.getDataInicioPesquisa() + "' "
				+ "AND RECEITA.DATARECEITA <= '" + lancamentoUsuarioDTO.getDataFimPesquisa() + "' "
				+ "GROUP BY USUARIO.IDUSUARIO";
		

		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				LancamentoUsuarioDTO lancamentoUsuario = new LancamentoUsuarioDTO();
				lancamentoUsuario.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				lancamentoUsuario.setNome(resultado.getString(2));
				lancamentoUsuario.setValor(Double.parseDouble(resultado.getString(3)));
				
				listaLancamentoUsuarioDTO.add(lancamentoUsuario);
			}	
		} catch (Exception e) {
			System.out.println("Erro ao executar a query do relatório total de receito dos usuarios.");
			System.out.println("Erro: " +  e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuariosPorPeriodoDAO( LancamentoUsuarioDTO lancamentoUsuarioDTO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<LancamentoUsuarioDTO> listaLancamentoUsuarioDTO = new ArrayList<LancamentoUsuarioDTO>();
		
		String query = "SELECT USUARIO.IDUSUARIO as ID, USUARIO.NOME as USUARIO, sum(DESPESA.VALOR) as DESPESAS FROM USUARIO INNER JOIN DESPESA ON USUARIO.IDUSUARIO = DESPESA.IDUSUARIO WHERE "
				+ "DESPESA.DATAVENCIMENTO >= '" + lancamentoUsuarioDTO.getDataInicioPesquisa() + "' "
				+ "AND DESPESA.DATAVENCIMENTO <= '" + lancamentoUsuarioDTO.getDataFimPesquisa() + "' "
				+ "GROUP BY USUARIO.IDUSUARIO";
		
		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				LancamentoUsuarioDTO lancamentoUsuario = new LancamentoUsuarioDTO();
				lancamentoUsuario.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				lancamentoUsuario.setNome(resultado.getString(2));
				lancamentoUsuario.setValor(Double.parseDouble(resultado.getString(3)));
				
				listaLancamentoUsuarioDTO.add(lancamentoUsuario);
			}	
		} catch (Exception e) {
			System.out.println("Erro ao executar a query do relatório total de receito dos usuarios.");
			System.out.println("Erro: " +  e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return listaLancamentoUsuarioDTO;
	}

	public ArrayList<LancamentoUsuarioDTO> gerarRelatorioTotalDespesasUsuarioAbertasPorPeriodoDAO() {
		
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<LancamentoUsuarioDTO> listaLancamentoUsuarioDTO = new ArrayList<LancamentoUsuarioDTO>();
		
		
		String query = "SELECT USUARIO.IDUSUARIO as ID, USUARIO.NOME as USUARIO, sum(DESPESA.VALOR) as DESPESAS FROM USUARIO  INNER JOIN DESPESA ON USUARIO.IDUSUARIO = DESPESA.IDUSUARIO WHERE "
				+ "DESPESA.DATAPAGAMENTO IS NULL "
				+ "GROUP BY USUARIO.IDUSUARIO";
		
		
		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				LancamentoUsuarioDTO lancamentoUsuario = new LancamentoUsuarioDTO();
				lancamentoUsuario.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				lancamentoUsuario.setNome(resultado.getString(2));
				lancamentoUsuario.setValor(Double.parseDouble(resultado.getString(3)));
				
				listaLancamentoUsuarioDTO.add(lancamentoUsuario);
			}	
		} catch (Exception e) {
			System.out.println("Erro ao executar a query do relatório total de receito dos usuarios.");
			System.out.println("Erro: " +  e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return listaLancamentoUsuarioDTO;
	}

}
