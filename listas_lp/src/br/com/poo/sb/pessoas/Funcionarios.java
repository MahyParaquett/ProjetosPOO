package br.com.poo.sb.pessoas;

public class Funcionarios {
	private String cargo;
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionarios() {
	}
	
	public Funcionarios(String cargo,String nome, String cpf, double salario) {
		this.cargo = cargo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public double getSalario() {
		return salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	//metodo de bonificacao
}
