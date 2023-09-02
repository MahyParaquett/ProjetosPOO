package br.com.poo.contabancaria;

public class SistemaInterno {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		
		minhaConta.titular = "Pedro";
		minhaConta.saldo = 1000.0;
		
		Conta minhaconta2 = new Conta(1,"Mahyara",10000);
		
		System.out.println(minhaConta);
		
		System.out.println(minhaconta2);
	}
	
}
