package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import model.vo.ReceitaVO;

public class ReceitaDAO {

	public boolean existeRegistroPorIdReceita(int idReceita) {

		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		String query = "SELECT IDRECEITA FROM RECEITA WHERE IDRECEITA = '" + idReceita + " ' ";
		
		
		try {
			resultado = stmt.executeQuery(query);
			
			if (resultado.next()) {
				return true;
			}  
		} catch (SQLException e) {
			System.out.println("Erro ao executar a query que verifica existência de uma redeceita por IDRECEITA");
			System.out.println("Erro: " + e.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return false;
	}

	public int cadastrarReceitaDAO(ReceitaVO receitaVO) {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		
		String query = "INSERT INTO RECEITA (IDUSUARIO,DESCRICAO,VALOR,DATARECEITA ) VALUES ('"
				+ receitaVO.getIdUsuario() + "','" 
				+ receitaVO.getDescricao() + "',"
				+ receitaVO.getValor() + ",'"	
				+ receitaVO.getDataReceita() + "')";
		
		 System.out.println(query);
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar o cadastro da Receita");
			System.out.println("Erro: " + e.getMessage());
		}finally {	
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}
		
		return resultado;
	}

	public int excluirDespesaDAO(ReceitaVO receitaVO) {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		int resultado = 0;
		
		String query = "DELETE FROM RECEITA WHERE IDRECEITA = " + receitaVO.getId();
		
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar o deletar receita");
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}

		return resultado;
	}

	public int atualizarDespesaDAO(ReceitaVO receitaVO) {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		int resultado = 0;
		
		
		String query = "UPDATE RECEITA SET IDUSUARIO = '"
				+ receitaVO.getIdUsuario() + "', DESCRICAO =  '"
				+ receitaVO.getDescricao() + "', VALOR = '"
				+ receitaVO.getValor() + "', DATARECEITA = '"
				+ receitaVO.getDataReceita() + "' "
				+ "WHERE IDRECEITA = " + receitaVO.getId();
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar o atualizar a receita");
			System.out.println("Erro: " + e.getMessage());
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}
		
		return resultado;
	}

	public ArrayList<ReceitaVO> consultarTodasDespesasDAO() {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		ResultSet resultado = null;
		
		ArrayList<ReceitaVO> listaReceitasVO = new ArrayList<ReceitaVO>();
		
		String query = "SELECT IDRECEITA,IDUSUARIO,DESCRICAO,VALOR,DATARECEITA  FROM RECEITA";

		try {
			resultado = stmt.executeQuery(query);
			
			while(resultado.next()) {
				ReceitaVO receita = new ReceitaVO();
				
				receita.setId(Integer.parseInt(resultado.getString(1)));
				receita.setIdUsuario(Integer.parseInt(resultado.getString(2)));
				receita.setDescricao(resultado.getString(3));
				receita.setValor(Double.parseDouble(resultado.getString(4)));
				receita.setDataReceita(LocalDate.parse(resultado.getString(5)));
				
				listaReceitasVO.add(receita);
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao executar o consultar todas as receitas");
			System.out.println("Erro: " + e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);	
		}
		
		
		return listaReceitasVO;
	}

	public ReceitaVO consultarReceitaDAO(ReceitaVO receitaVO) {
		Connection conn =  Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);	
		ResultSet resultado = null;
		
		ReceitaVO receita = new ReceitaVO();
		
		String query = "SELECT IDRECEITA,IDUSUARIO,DESCRICAO,VALOR,DATARECEITA  FROM RECEITA WHERE IDRECEITA =" + receitaVO.getId() ;
		
		try {
			resultado = stmt.executeQuery(query);
			
			while(resultado.next()) {
				
				receita.setId(Integer.parseInt(resultado.getString(1)));
				receita.setIdUsuario(Integer.parseInt(resultado.getString(2)));
				receita.setDescricao(resultado.getString(3));
				receita.setValor(Double.parseDouble(resultado.getString(4)));
				receita.setDataReceita(LocalDate.parse(resultado.getString(5)));
			
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consulta a receita");
			System.out.println("Erro: " + e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return receita;
	}

}
