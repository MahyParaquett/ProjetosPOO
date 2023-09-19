package br.com.poo.TrabIndividual;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.TrabIndividual.io.LeituraEscrita;
import br.com.poo.TrabIndividual.util.Util;

public class Execucao {
	 static String resposta;
	 
	public static void main(String[] args) throws IOException  {
		
		Scanner sc = new Scanner(System.in);	
		LeituraEscrita.leitor("Dado");
		Logger logger = Util.setupLogger();
		
		//Menu
		do {
			
		logger.log(Level.INFO,"Olá, bem vindo ao menu da delegacia!\n Escolha o número do "
				+ "relatório que deseja gerar"); 
		
		logger.log(Level.INFO, "1- Mostrar todos o registros de uma delegacia pelo nome do(a) delegada(a); \n"
				+ "2- Apresentar todos os casos que aconteceram em casa");
		
		resposta = sc.nextLine();
		
		Util.limpa();
		
		switch(resposta) {
		case "1":
			logger.log(Level.INFO, "Digite o nome do(a) Delegado(a):");
			
			String delegado = sc.nextLine();
			
			logger.log(Level.INFO,"\nAqui estão as denuncias homologadas pelo(a) Dr.(a) " + delegado + "");
			Delegacia.localizar(delegado);
			
			logger.log(Level.INFO, "\nO que deseja fazer agora: \n1-Voltar; \n2-Imprimie o relatório;");
			String opcao = sc.nextLine();
			
			switch(opcao) {
			case "1":
				resposta = "3";
			break;
			
			case "2":
				LeituraEscrita.relatorio(delegado);
				logger.log(Level.INFO, "Impressão realidada, confira na sua pasta temp!");
				resposta = "3";
			break;
			}
					
			
					
		case "2":
		
		break;	
		
		
		
		}
		}while (!resposta.equals("3"));
		Util.limpa();
		logger.log(Level.INFO,"Saindo do sistema...");
		
		sc.close();
		
		}
	}


