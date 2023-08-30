package br.com.poo.aula;

public class BalancoTrimestral2 {

	public static void main(String[] args) {
		Double gastosJaneiro = 15000.0;
		Double gastosFevereiro = 23000.0;
		Double gastosMarço = 17000.0;
				
		Double gastosTrimestre= gastosJaneiro+gastosFevereiro+gastosMarço;
				
		System.out.println("Os gastos do trimestre foram: "+ gastosTrimestre);
	}

}
