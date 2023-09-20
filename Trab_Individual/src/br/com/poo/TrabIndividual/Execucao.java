package br.com.poo.TrabIndividual;

import java.io.IOException;
import java.util.logging.Logger;
import br.com.poo.TrabIndividual.io.LeituraEscrita;
import br.com.poo.TrabIndividual.util.Util;

public class Execucao {
	static boolean menu = true;
	static Logger logger = Util.setupLogger();
	
	public static void main(String[] args) throws IOException {
		LeituraEscrita.leitor("Dado");

		// Menu
		Menus m = new Menus();
		m.menu1(menu);
	}
}
