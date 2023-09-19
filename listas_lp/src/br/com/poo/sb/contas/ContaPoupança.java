package br.com.poo.sb.contas;

public class ContaPoupança extends Conta{
	
	private double rendimento;

	public ContaPoupança() {
		super();
	}

	public ContaPoupança(String tipoConta,String numConta, String cpfTitular, Double saldo) {
		super(tipoConta,numConta,  cpfTitular, saldo);
		
	}

	public double getRendimento() {
		return rendimento;
	}
	
	
	
	
	
	
}
