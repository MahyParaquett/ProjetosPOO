package br.com.poo.sb.contas;

public class ContaCorrente extends Conta {
	
	private Double chequeEspecial;
	//private boolean chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipoConta, String numConta, String  cpfTitular, Double saldo, Double chequeEspecial) {
		super(tipoConta, numConta,  cpfTitular, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}
	
	
	
	
	
	
	
}
