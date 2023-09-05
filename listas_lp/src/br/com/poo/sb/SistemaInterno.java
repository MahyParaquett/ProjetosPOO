package br.com.poo.sb;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.sb.contas.Conta;

public class SistemaInterno {

	private static Logger logger = Logger.getLogger(SistemaInterno.class.getName());
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(123, "Pedro", 1000.0);
		
		c1.getTitular();
		c1.getSaldo();
		//c1.sacar(0.0);
						
		logger.log(Level.INFO,"A permissão para saque é {0}", new Object[]{c1.sacar(0.0)});
						
	}
	
}
