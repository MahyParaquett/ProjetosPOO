package br.com.poo.sb.contas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;
	
	private static Logger logger = Logger.getLogger(Conta.class.getName());
	
	public Conta() {
	}

	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

//	@Override
//	public String toString() {
//		return numero + " " + titular + " " + saldo;
//	}
	
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else if(valor <= 0.0) {
			logger.log(Level.INFO, "Valor inválido");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}
