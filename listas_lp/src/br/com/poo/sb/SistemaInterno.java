package br.com.poo.sb;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;

import br.com.poo.sb.contas.Conta;
import br.com.poo.sb.io.LeituraEscrita;
import br.com.poo.sb.pessoas.Funcionarios;
import br.com.poo.sb.pessoas.Gerente;
import br.com.poo.util.Util;

public class SistemaInterno {
	
	public static void main(String[] args) throws IOException {
//		//instanciar o metodo de leitura 
//		LeituraEscrita.leitor("banco");
//		
//		//instanciar o metodo de escrita
//		LeituraEscrita.escritor("banco");
		
		
		//formata saida
		DecimalFormat df = new DecimalFormat ("#,###.##");
			
		//criando um objeto
		Conta c1 = new Conta("Corrente","123", "123.456.789-11", 1000.0);
		System.out.println("Antes: "+ c1.getSaldo());
		
		//Chamando o relatório
		LeituraEscrita.comprovanteSaque(c1, 50.00);
		System.out.println("Depois: "+ c1.getSaldo());
		
		
		//Conta c1 = new ContaCorrente();
		//ContaCorrente c3 = new ContaCorrente();
		Funcionarios f1 = new Gerente();
		
		c1.getCpfTitular();
		
		
		//usado para tirar o cabeçalho do logger
		Util.customizer(); 
		
		//usado evitar repetição do logger no console
		Util.setupLogger().log(Level.INFO, ()-> "CPF do titular: "+ c1.getCpfTitular()
					+ " Saldo: " + df.format(c1.getSaldo()));
												
	}
	
}
