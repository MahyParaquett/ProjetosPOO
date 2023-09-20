package br.com.poo.TrabIndividual;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.TrabIndividual.io.LeituraEscrita;
import br.com.poo.TrabIndividual.util.Util;

public class Menus {
	static String resposta;
	Scanner sc = new Scanner(System.in);
	Logger logger = Util.setupLogger();

	// Menu escolha entre relatórios
	public void menu1(boolean menu) throws IOException {
		while (menu) {
			Util.customizer();
			logger.log(Level.INFO,
					"Bem vindo(a) ao menu da delegacia!\n Escolha o número do " + "relatório que deseja gerar");
			Util.customizer();
			logger.log(Level.INFO, "1- Mostrar todos o registros de pelo nome do(a) delegada(a); \n"
					+ "2- Apresentar os casos que aconteceram com a vítima em casa\n3-Sair;");

			resposta = sc.nextLine();

			Util.limpa();

			switch (resposta) {
			case "1":
				logger.log(Level.INFO, "Digite o nome do(a) Delegado(a):");

				String delegado = sc.nextLine();

				final String TXT = "\nAqui estão as denuncias homologadas pelo(a) Dr.(a) ";
				Util.customizer();
				logger.log(Level.INFO, () -> TXT + delegado);

				Util.customizer();
				logger.log(Level.INFO, Delegacia.localizar(delegado));

				menu2(delegado, true);

				break;

			case "2":
				final String TXT2 = "\nAqui estão os casos que aconteceram com a vítima em casa: ";
				Util.customizer();
				logger.log(Level.INFO, TXT2);
				Util.customizer();
				logger.log(Level.INFO, Denuncia.classificador());

				menu3(true);
				break;

			case "3":
				Util.customizer();
				logger.log(Level.INFO, "Programa encerrado");
				menu = false;

				break;
			}
		}
	}

	public void menu2(String delegado, boolean menu) throws IOException {
		Util.customizer();
		logger.log(Level.INFO, "\nO que deseja fazer agora: \n1-Voltar; \n2-Imprimie o relatório;");
		String opcao = sc.nextLine();

		switch (opcao) {
		case "1":
			menu = false;
			Util.limpa();
			break;

		case "2":
			Util.limpa();
			Util.customizer();
			logger.log(Level.INFO, "Impressão realidada, confira na sua pasta temp!\n\n");
			LeituraEscrita.relatorioDenunciaxDelegado(delegado);
			menu = false;
			break;

		}
	}

	public void menu3(boolean menu) throws IOException {
		logger.log(Level.INFO, "\nO que deseja fazer agora: \n1-Voltar; \n2-Imprimie o relatório;");
		String opcao2 = sc.nextLine();

		switch (opcao2) {
		case "1":
			menu = false;
			Util.limpa();
			break;

		case "2":
			Util.limpa();
			Util.customizer();
			logger.log(Level.INFO, "Impressão realidada, confira na sua pasta temp!\n\n");
			LeituraEscrita.relatorioCasoCasa();
			menu = false;
			break;

		}

	}
}
