package com.target.treinamento.projeto_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FabricaDeConexao {

	private Connection connection = null;

	public Connection getConnection() {

		try {
			//faz um reflaction a classe Driver do pacote org.postgresql
			Class.forName("org.postgresql.Driver");
			//Faz a conexão com o banco de dados.
			connection = DriverManager.getConnection("jdbc:postgresql://ec2-23-21-128-35.compute-1.amazonaws.com:5432/d5k5g3oob6tn20", "kxwedtxgcfjgvt", "218b0dd9927d70d198d3f587b28ad32c6dd9cd00ac1c5d33803b8bc982f819e2");



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// finally sempre é executado e portanto deverá ser declarado o fechamento da conexão com o banco de dados
		}
				
		return connection;
	}
	
	public PreparedStatement getPreparedStatement(String sql) {
		
		try {
			return connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void fecharConexao() {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
