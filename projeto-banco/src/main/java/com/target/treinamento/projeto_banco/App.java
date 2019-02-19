package com.target.treinamento.projeto_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class App 
{
	public static void main( String[] args ){

		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();


		try {
			String sql = "INSERT INTO pessoas (primeiro_nome, segundo_nome, endereco, cidade) values(?, ?, ?, ?)";
			// instancia um objeto statement para manipular a DML
			


			statement.setString(1, "João");
			statement.setString(2, "Selestino");
			statement.setString(3, "Maranhao");
			statement.setString(4, "Parnamirim");

			int retorno = statement.executeUpdate();

			if (retorno == 1) {
				System.out.println("Sucesso!");
			} else {
				System.out.println("Falhou");
			}

			String consultaInsert = "SELECT P.ID, P.PRIMEIRO_NOME, P.SEGUNDO_NOME, P.ENDERECO, P.CIDADE FROM PESSOAS P";
			PreparedStatement preparedStatement = connection.prepareStatement(consultaInsert);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String primeiroNome = resultSet.getString("PRIMEIRO_NOME");
				String segundoNome = resultSet.getString("SEGUNDO_NOME");
				String endereco = resultSet.getString("ENDERECO");
				String cidade = resultSet.getString("CIDADE");
				Long id = resultSet.getLong("ID");

				System.out.println(id);
				System.out.println(primeiroNome);
				System.out.println(segundoNome);
				System.out.println(endereco);
				System.out.println(cidade);


			}

			// fecha o statemente para manipulação do DML
			statement.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// finally sempre é executado e portanto deverá ser declarado o fechamento da conexão com o banco de dados
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
