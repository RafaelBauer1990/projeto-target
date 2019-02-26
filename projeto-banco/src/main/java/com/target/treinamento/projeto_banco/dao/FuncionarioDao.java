package com.target.treinamento.projeto_banco.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.target.treinamento.projeto_banco.FabricaDeConexao;
import com.target.treinamento.projeto_banco.Funcionario;


public class FuncionarioDao {

	public void cria (Funcionario funcionario) {
		FabricaDeConexao conexao = new FabricaDeConexao();

		conexao.getConnection();

		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO funcionarios");
		sb.append("(nome, cargo, idade, salario, data_inclusao)");
		sb.append("VALUES (?, ?, ?, ?, ?)");
		

		PreparedStatement ps = conexao.getPreparedStatement(sb.toString());
		try {
			ps.setString(1, funcionario.getNome());
			ps.setInt(2, funcionario.getCargo());
			ps.setInt(3, funcionario.getIdade());
			ps.setDouble(4, funcionario.getSalario());
			ps.setDate(5, new Date(funcionario.getDataInclusao().getTimeInMillis()));

			ps.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conexao.fecharConexao();
		}

	}

	//Faz a busca de todos os funcionarios da tabela funcionario
	public List<Funcionario> buscaTodos () {
		FabricaDeConexao conexao = new FabricaDeConexao();

		List<Funcionario> funcionariosLista = new ArrayList<Funcionario>();

		try {
			//abre a conexão com o banco de dados
			conexao.getConnection();

			//envia a query para o banco de dados
			PreparedStatement ps = conexao.getPreparedStatement("SELECT F.ID, F.NOME, F.IDADE, F.CARGO, F.SALARIO, F.DATA_INCLUSAO FROM FUNCIONARIOS F");

			//ResultSet Retorna os cursores da tabela
			// executeQuery realiza a execução da query dentro do objeto PreparedStatement
			ResultSet resultSet = ps.executeQuery();

			// percorre o objeto enquanto as linhas da tabela forem true
			while (resultSet.next()) {
				Funcionario f = new Funcionario();
				
				//getInstance retorna a data e hora atual do sistema
				Calendar c = Calendar.getInstance();
				
				//Busca a data do banco no campo Data inclusão
				Date dataDoBanco = resultSet.getDate("DATA_INCLUSAO");
				
				c.setTimeInMillis(dataDoBanco.getTime());
				
				
				f.setId(resultSet.getLong("ID"));
				f.setNome(resultSet.getString("NOME"));
				f.setCargo(resultSet.getInt("CARGO"));
				f.setIdade(resultSet.getInt("IDADE"));
				f.setSalario(resultSet.getDouble("SALARIO"));
				f.setDataInclusao(c);

				funcionariosLista.add(f);			

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conexao.fecharConexao();
		}
		return funcionariosLista;
	}



	public void atualiza (Funcionario funcionario) {
		FabricaDeConexao conexao = new FabricaDeConexao();

		conexao.getConnection();

		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE funcionarios");
		sb.append("nome=?, cargo=?, idade=?, salario=?");
		sb.append("WHERE  <condition>");

		PreparedStatement ps = conexao.getPreparedStatement(sb.toString());
		try {
			ps.setString(1, funcionario.getNome());
			ps.setInt(2, funcionario.getCargo());
			ps.setInt(3, funcionario.getIdade());
			ps.setDouble(4, funcionario.getSalario());
			ps.setDouble(4, funcionario.getSalario());

			ps.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conexao.fecharConexao();
		}
	}

	public void deleta (Funcionario funcionario) {
		FabricaDeConexao conexao = new FabricaDeConexao();

		conexao.getConnection();

		StringBuilder sb = new StringBuilder();
		sb.append("DELETE FROM funcionarios");
		sb.append("nome=?, cargo=?, idade=?, salario=?");
		sb.append("WHERE  <condition>");

		PreparedStatement ps = conexao.getPreparedStatement(sb.toString());
		try {
			ps.setString(1, funcionario.getNome());
			ps.setInt(2, funcionario.getCargo());
			ps.setInt(3, funcionario.getIdade());
			ps.setDouble(4, funcionario.getSalario());

			ps.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conexao.fecharConexao();
		}

	}

}
