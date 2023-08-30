package br.com.poo.aula;

import java.math.BigDecimal;

public class BalancoTrimestral3 {

	public static void main(String[] args) {
		BigDecimal gastosJaneiro = new BigDecimal(15000);
		BigDecimal gastosFevereiro = new BigDecimal(23000);
		BigDecimal gastosMarço = new BigDecimal(17000);
		BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarço);		
						
		System.out.println("Os gastos do trimestre foram: "+ gastosTrimestre);
	}

}