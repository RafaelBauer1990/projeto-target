package com.target.treinamento.projeto_banco.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.target.treinamento.projeto_banco.Funcionario;

@Entity
@Table(name="BANCOS")
public class Banco {
	
	
	@Id
	@Column(name = "ID") //Essas serão minhas colunas
	@SequenceGenerator(name = "geradorDeIdBanco", sequenceName="geradorDeIdBanco", allocationSize = 1)
	@GeneratedValue(generator = "geradorDeIdBanco")
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@OneToMany
	private List<Funcionario> listFuncionarios; 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNomeBanco(String nome) {
		this.nome = nome;
	}
	
	public List<Funcionario> getFuncionarios() {
		return listFuncionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.listFuncionarios = funcionarios;
	}
	

}
