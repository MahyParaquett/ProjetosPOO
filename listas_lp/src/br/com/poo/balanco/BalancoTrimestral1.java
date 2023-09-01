package br.com.poo.balanco;

public class BalancoTrimestral1 {

	public static void main(String[] args) {
		Integer gastosJaneiro = 15000;
		Integer gastosFevereiro = 23000;
		Integer gastosMarco = 17000;
				
		Integer gastosTrimestre= gastosJaneiro+gastosFevereiro+gastosMarco;
				
		System.out.println("Os gastos do trimestre foram: "+ gastosTrimestre);
	}

}
