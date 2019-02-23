package com.target.treinamento.projeto_banco;

import java.util.Calendar;

public class Funcionario {

	private Long id;
	private String nome;
	private Integer idade;
	private Double salario;
	private Integer cargo;
	private Calendar dataInclusao;

	public Funcionario() {}
	
	public Funcionario(Long id, String nome, Integer cargo, Integer idade, Double salario, Calendar dataInclusao) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.dataInclusao = dataInclusao;
	}
		
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", cargo="
				+ cargo + ", dataInclusao=" + dataInclusao + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCargo() {
		return cargo;
	}
	public void setCargo(Integer cargo) {
		this.cargo = cargo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
		
	public Calendar getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Calendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}


}
