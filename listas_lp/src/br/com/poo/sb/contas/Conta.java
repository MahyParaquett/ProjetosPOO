package br.com.poo.sb.contas;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conta {

	private String tipoConta;
	private String numConta;
	private String cpfTitular;
	private Double saldo;
	
	//criar map
	public static Map<String, Conta> mapaContas = new HashMap<>();

	//instanciando o log
	private static Logger logger = Logger.getLogger(Conta.class.getName());

	//contrutor default
	public Conta() {
	}

	public Conta(String tipoConta, String numConta, String cpfTitular, Double saldo) {
		this.tipoConta = tipoConta;
		this.numConta = numConta;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
	}

//	@Override
//	public String toString() {
//		return numConta + " " + titular + " " + saldo;
//	}

	public boolean sacar(Double valor) {
		if (this.saldo < valor) {
			return false;
		} else if (valor <= 0.0) {
			logger.log(Level.INFO, "Valor inválido");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public String getNumConta() {
		return numConta;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", titular=" + cpfTitular + ", saldo=" + saldo + "]\n";
	}

}
