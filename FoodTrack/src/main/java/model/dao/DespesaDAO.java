package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import model.vo.DespesaVO;

public class DespesaDAO {
		
	
	public boolean existeRegistroPorIdDespesa(int idDespesa) {
		
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		String query = "SELECT IDDESPESA FROM DESPESA WHERE IDDESPESA = '" + idDespesa + " ' ";
		
		try {
			resultado = stmt.executeQuery(query);
			
			if (resultado.next()) {
				return true;
			}  
		} catch (SQLException e) {
			System.out.println("Erro ao executar a query que verifica existência de despesa por IDDESPESA");
			System.out.println("Erro: " + e.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		
		return false;
	}

	public int cadastrarDespesaDAO(DespesaVO despesaVO) {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		
		String query = "INSERT INTO DESPESA (IDUSUARIO,DESCRICAO,VALOR,DATAVENCIMENTO,DATAPAGAMENTO,CATEGORIA ) VALUES ('"
				+ despesaVO.getIdUsuario() + "','" 
				+ despesaVO.getDescricao() + "',"
				+ despesaVO.getValor() + ",'"	
				+ despesaVO.getDataVencimento() + "','"
				+ despesaVO.getDataPagamento() + "','"
				+ despesaVO.getCategoria() + "')";
		
		 System.out.println(query);
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar o cadastro da Despesa");
			System.out.println("Erro: " + e.getMessage());
		}finally {	
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}
		
		return resultado;
	}

	public int excluirDespesaDAO(DespesaVO despesaVO) {

		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		int resultado = 0;
		
		String query = "DELETE FROM DESPESA WHERE IDDESPESA = " + despesaVO.getId();
		
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar o deletar despesa");
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}

		return resultado;
		
	}

	public int atualizarDespesaDAO(DespesaVO despesaVO) {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		int resultado = 0;
		
		String query = "UPDATE DESPESA SET IDUSUARIO = '"
				+ despesaVO.getIdUsuario() + "', DESCRICAO = '"
				+ despesaVO.getDescricao() + "', VALOR = '"
				+ despesaVO.getValor() + "', DATAVENCIMENTO = '" 
				+ despesaVO.getDataVencimento() + "',DATAPAGAMENTO = '"
				+ despesaVO.getDataPagamento() + "', CATEGORIA = '"
				+ despesaVO.getCategoria() + "' WHERE IDDESPESA = " + despesaVO.getId();
		
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar o atualizar a despesa");
			System.out.println("Erro: " + e.getMessage());
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}
		
		return resultado;
	}



	public ArrayList<DespesaVO> consultarTodasDespesasDAO() {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		ResultSet resultado = null;
		
		ArrayList<DespesaVO> listaDespesasVO = new ArrayList<DespesaVO>();
		
		String query = "SELECT IDDESPESA,IDUSUARIO,DESCRICAO,VALOR,DATAVENCIMENTO,DATAPAGAMENTO,CATEGORIA FROM DESPESA";
		
	

		try {
			resultado = stmt.executeQuery(query);
			
			while(resultado.next()) {
				DespesaVO despesa = new DespesaVO();
				
				despesa.setId(Integer.parseInt(resultado.getString(1)));
				despesa.setIdUsuario(Integer.parseInt(resultado.getString(2)));
				despesa.setDescricao(resultado.getString(3));
				despesa.setValor(Double.parseDouble(resultado.getString(4)));
				despesa.setDataVencimento(LocalDate.parse(resultado.getString(5)));
				despesa.setDataPagamento(LocalDate.parse(resultado.getString(6)));
				despesa.setCategoria(resultado.getString(7));
				
				listaDespesasVO.add(despesa);
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao executar o consultar todas as despesas");
			System.out.println("Erro: " + e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}
		
		return listaDespesasVO;
	}

	public DespesaVO consultarDespesaDAO(DespesaVO despesaVO) {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		ResultSet resultado = null;
		
		DespesaVO despesa = new DespesaVO();
		
		String query = "SELECT IDDESPESA,IDUSUARIO,DESCRICAO,VALOR,DATAVENCIMENTO,DATAPAGAMENTO,CATEGORIA FROM DESPESA WHERE IDDESPESA = " + despesaVO.getId() ;

		try {
			resultado = stmt.executeQuery(query);
			
			while(resultado.next()) {
				
				despesa.setId(Integer.parseInt(resultado.getString(1)));
				despesa.setIdUsuario(Integer.parseInt(resultado.getString(2)));
				despesa.setDescricao(resultado.getString(3));
				despesa.setValor(Double.parseDouble(resultado.getString(4)));
				despesa.setDataVencimento(LocalDate.parse(resultado.getString(5)));
				despesa.setDataPagamento(LocalDate.parse(resultado.getString(6)));
				despesa.setCategoria(resultado.getString(7));
					
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consulta o usuario");
			System.out.println("Erro: " + e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return despesa;
	}

}
