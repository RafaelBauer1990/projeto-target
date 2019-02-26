package com.target.treinamento.projeto_banco;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NewApp {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testBanco");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
//		Funcionario funcionario = new Funcionario();
//		funcionario.setNome("Ornitorrinco");
//		funcionario.setCargo(1);
//		funcionario.setIdade(7);
//		funcionario.setSalario(55609.74);
//		funcionario.setDataInclusao(Calendar.getInstance());;
		//executar a transação
		
		Funcionario func = entityManager.find(Funcionario.class, 124L);
		
		System.out.println(func.getNome() +" - " + func.getSalario());
		
		func.setSalario(func.getSalario()*1.1);
		
		
		entityManager.getTransaction().commit();
		
		System.out.println(func.getNome() +" - " + func.getSalario());
		
		entityManagerFactory.close();
	}

}
