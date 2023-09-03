package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MelhorarLogger {
		
			private Integer gastosJaneiro = 15000;
			private Integer gastosFevereiro = 23000;
			private Integer gastosMarco = 17000;
					
			
			private static Logger logger = Logger.getLogger(MelhorarLogger.class.getName());
			
			//private static final Logger LOGGER = Logger.getLogger(MelhorarLogger.class.getName());//
			
			
			private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
			//String converte = somaTotal.toString();
			
			public int soma() {
				//System.out.printf("O balço trimestral é de R$ %d", somaTotal)
				//String mensagem = String.format("O balanço trimestral é de R$ %d", somaTotal);
				//LOGGER.info(String.format("O balanço trimestral é de R$ {}", converte));
								
				logger.log(Level.INFO,"O balanço trimestral é de R$ {0}", somaTotal);
				return somaTotal;
			}
			
			public int soma(int janeiro) {
				logger.log(Level.INFO,"O gasto de Janeiro é de R$ {0}", janeiro);
				return janeiro;
			}
			
			public int soma(int janeiro, int fevereiro) {
				int somaBi = janeiro + fevereiro;
				logger.log(Level.INFO,"O gasto do primeiro bimestre é de R$ {0}", somaBi);
				return somaBi;
			}
			
			public int soma(int janeiro, int fevereiro, int marco) {
				int somaTri = janeiro + fevereiro + marco;
				logger.log(Level.INFO,"O gasto do primeiro trimestre é de R$ {0}", somaTri);
				return somaTri;
			}
	}