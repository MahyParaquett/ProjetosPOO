package br.com.poo.sb.pessoas;

import java.util.Map;
import java.util.HashMap;

public class Cliente {

	private final String TIPO_PESSOA = "Cliente";
	private String nome;
	String cpf;
	private Integer senha;

	public static Map<String, Cliente> mapaClientes = new HashMap<>();
	
	public Cliente() {
		super();

	}

	public Cliente(String TIPO_PESSOA,String nome, String cpf, Integer senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getTIPO_PESSOA() {
		return TIPO_PESSOA;
	}

	public String getNome() {
		return nome;
	}

	public Integer getSenha() {
		return senha;
	}

}
