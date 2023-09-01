package br.com.poo.balanco;

import java.math.BigDecimal;

public class BalancoTrimestral3 {

	public static void main(String[] args) {
		BigDecimal gastosJaneiro = new BigDecimal(15000);
		BigDecimal gastosFevereiro = new BigDecimal(23000);
		BigDecimal gastosMarco = new BigDecimal(17000);
		BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);		
						
		System.out.println("Os gastos do trimestre foram: "+ gastosTrimestre);
	}

}