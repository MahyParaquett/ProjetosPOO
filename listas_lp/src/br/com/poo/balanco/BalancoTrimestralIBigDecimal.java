package br.com.poo.balanco;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralIBigDecimal {
	BigDecimal gastosJaneiro = new BigDecimal(15000.00);
	BigDecimal gastosFevereiro = new BigDecimal(23000.00);
	BigDecimal gastosMarco = new BigDecimal(17000.00);
	BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);		
					
	private BigDecimal somaTotal = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
	//linha do logger--> tipo o do scanner-->fora do método
	private static Logger logger = Logger.getLogger(BalancoTrimestralDouble.class.getName());
	
	public BigDecimal soma() {
		logger.log(Level.INFO, "O balanço trimestral é de R$"+ somaTotal);
		return somaTotal;
	}
	public BigDecimal soma(BigDecimal janeiro) {
		logger.log(Level.INFO, "O  balanço trimestral é de R$" + janeiro);
		return janeiro;
	}
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro) {
		BigDecimal somaBi = janeiro.add(fevereiro);
		logger.log(Level.INFO, "O  balanço trimestral é de R$" + somaBi);
		return somaBi;
	}
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		BigDecimal somaTri = janeiro.add(fevereiro).add(marco);
		logger.log(Level.INFO, "O  balanço trimestral é de R$" + somaTri);
		return somaTri;
			}
	
	
	
	
}
