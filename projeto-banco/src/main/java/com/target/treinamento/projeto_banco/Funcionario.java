package com.target.treinamento.projeto_banco;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.target.treinamento.projeto_banco.dominio.Banco;


@Entity // eu su uma persistence class
@Table(name = "FUNCIONARIOS") // quero que crie uma tabela ou mapeie essa tabela com esse nome
public class Funcionario {

	@Id
	@Column(name = "ID") //Essas serão minhas colunas
	@SequenceGenerator(name = "geradorDeId", sequenceName="funcionarios_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "geradorDeId")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private Integer idade;
	
	@Column(name = "salario")
	private Double salario;
	
	@Column(name = "cargo")
	private Integer cargo;
	
	@Column(name = "data_inclusao")
	@Temporal(TemporalType.DATE) // determinar o modelo de data
	private Calendar dataInclusao;

	@JoinColumn (name = "ID_BANCO")
	@ManyToOne
	private Banco banco;
	
	
	public Funcionario() {}
	
	

	public Funcionario(Long id, String nome, Integer cargo, Integer idade, Double salario) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.dataInclusao = Calendar.getInstance();
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
