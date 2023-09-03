package br.com.poo.balanco;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParteII {
	
	DecimalFormat df = new DecimalFormat("#,###.##");
	private static Logger logger = Logger.getLogger(ParteII.class.getName());
	
	public ParteII() {
		logger.log(Level.INFO, "Objeto foi criado");
	}
	
	
	static final String GJ = "O gasto de Janeiro é de R$  ";
	
	public int gastos(int janeiro) {
		logger.log(Level.INFO,()->GJ + df.format(janeiro));
		return janeiro;
	}
	
static final String GFM = "Os gastos fevereiro e março é respectivamente R$";
	
	public double gastos(double fevereiro, double marco) {
		logger.log(Level.INFO,()-> GFM + df.format(fevereiro)+ " "+"R$" +df.format(marco));
		return fevereiro + marco;
	}
	
	public double gastos(double abril) {
		logger.log(Level.INFO,()->"O gasto de abril foi de R$ "+ df.format(abril));
		return abril;
	}
	public double gastos(float maio) {
		logger.log(Level.INFO,()->"O gasto de maio foi de R$ "+ df.format(maio));
		return maio;
	}
	static final String GJJ = "Os gastos junho e julho é respectivamente R$";
	public double gastos(double junho, float julho) {
		logger.log(Level.INFO,()-> GJJ + df.format(junho)+ " "+"R$" +df.format(julho));
		return junho + julho;
	}
	
	
}
