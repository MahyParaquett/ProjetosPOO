package br.com.poo.balanco;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.util.Util;

public class BalancoTrimestralDouble {

	private Double gastosJaneiro = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco = 17000.00;

	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private DecimalFormat df = new DecimalFormat("#,###.##"); //cpf ###,###,###-##
	
	static final String TXT = "O balanço trimestral é de R$: ";
	
	private static Logger logger = Logger.getLogger(BalancoTrimestralDouble.class.getName());

	public double soma() {
					
		//tirar do console a data e hora do logger
		Logger logger2 = Util.setupLogger();
		logger2.log(Level.INFO, () -> TXT + df.format(somaTotal));
		
		// ()-> Classe anonima/lambda
		logger.log(Level.INFO,()-> TXT + df.format(somaTotal));
		return somaTotal;
	}
	static final String GJ = "O gasto de Janeiro é de R$  ";
	public double soma(double janeiro) {
		logger.log(Level.INFO, () -> GJ + df.format(janeiro));
		return janeiro;
	}
	
	static final String GB ="o gasto do primeiro bimestre é de R$ ";
	public double soma(double janeiro, double fevereiro) {
		double somaBi = janeiro + fevereiro;
		logger.log(Level.INFO,()-> GB + df.format(somaBi));
		return somaBi;
	}
	
	static final String GT ="o gasto do primeiro trimestre é de R$ ";
	public double soma(double janeiro, double fevereiro, double marco) {
		double somaTri = janeiro + fevereiro + marco;
		logger.log(Level.INFO,()-> GT + df.format(somaTri));
		return somaTri;
		
	}
}
