package br.com.poo.balanco;

import java.math.BigDecimal;

public class BalancoTrimestral {
	//Logger definido fora do método
	// private static Logger logger = Logger.getLogger(BalancoTrimestral.class.getName());

	public static void main(String[] args) {
		//Logger definido dentro do metodo
		//Logger logger = Logger.getLogger(BalancoTrimestral.class.getName());
		
		
		//instancia do balanco Integer
		BalancoTrimestralInt bti = new BalancoTrimestralInt();
		bti.soma();
		bti.soma(10000);
		bti.soma(10, 50);
		bti.soma(80, 90,100);
		
		//instancia do balanco Double
		BalancoTrimestralDouble btd = new BalancoTrimestralDouble();
		btd.soma();
		btd.soma(258);
		btd.soma(5000, 3000 );
		btd.soma(0, 0, 0);
		
		//instancia do balanco BigDecimal
		BalancoTrimestralIBigDecimal btg = new BalancoTrimestralIBigDecimal();
		btg.soma();
		btg.soma(new BigDecimal(100));// esse tipo de syntax é a mesma coisa que btg.soma(100)//--> nesse caso estou atribuindo 100 a variavel de janeiro 
		btg.soma(new BigDecimal(100), new BigDecimal(50));
		btg.soma(new BigDecimal(100),new BigDecimal(50), new BigDecimal(150));
	}

}
