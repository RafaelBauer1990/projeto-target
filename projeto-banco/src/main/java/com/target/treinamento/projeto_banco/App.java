package com.target.treinamento.projeto_banco;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.target.treinamento.projeto_banco.dao.FuncionarioDao;

public class App 
{
	public static void main( String[] args ) throws SQLException{
		
		
		FuncionarioDao fDao = new FuncionarioDao();
		
		//fDao.cria(new Funcionario(null, "Rafael", 4, 28, 1800.00));
		
		
		
		List<Funcionario> lista = fDao.buscaTodos();
		for (Funcionario funcionario : lista) {
			
			System.out.println(funcionario.toString());
									
		}
			
		
		
		}		
		
	}

