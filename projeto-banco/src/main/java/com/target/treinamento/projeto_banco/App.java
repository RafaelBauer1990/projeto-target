package com.target.treinamento.projeto_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class App 
{
	public static void main( String[] args ) throws SQLException{

		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
						
		String sql = "SELECT F.ID, F.NOME, F.CARGO, F.IDADE, F.SALARIO FROM FUNCIONARIO F";
		PreparedStatement preparedStatement = fabricaDeConexao.getPreparedStatement(sql);
		
		ResultSet resultSet = preparedStatement.executeQuery(sql);
		
		Integer id = resultSet.getInt("id");
		String nome = resultSet.getString("nome");
		Integer cargo = resultSet.getInt("cargo");
		Integer idade = resultSet.getInt("idade");
		Float salario = resultSet.getFloat("salario");
		
		
		//List<Funcionario> listaFuncionarios = ArrayList<Funcionario>();
		
	}
}
