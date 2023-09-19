package br.com.poo.sb.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.poo.sb.contas.Conta;
import br.com.poo.sb.contas.ContaPoupança;
import br.com.poo.sb.enums.ContaEnum;
import br.com.poo.sb.pessoas.Cliente;

public class LeituraEscrita {
	// constantes
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	// método estático
	public static void leitor(String path) throws IOException {

		// permissão da leitura do arquivo
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		// definir uma variavel string
		String linha = "";

		// faço um enquanto para ler
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				// sepadação da informação por ; e digo que as linhas são string
				String[] dados = linha.split(";");

				// equalsIgnoreCase é a mesma coisa que o == "1"--> usamos em comparação de
				// string
				if (dados[0].equalsIgnoreCase(ContaEnum.POUPANCA.getTipoConta())) {
					
					//cria objeto
					ContaPoupança cp = new ContaPoupança(dados[0], dados[1], 
							dados[2], Double.parseDouble(dados[3]));
					
					//coloca o objeto no map
					//dentro do array eu coloco a posição onde tem o identificador unico
					Conta.mapaContas.put(dados[2],cp);
					
				} else if (dados[0].equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
					
				}else if (dados[0].equalsIgnoreCase("CLIENTE")) {
				//	String TIPO_PESSOA,String nome, String cpf, Integer senha
					Cliente c = new Cliente(dados[0], dados[1], dados[2],
							Integer.parseInt(dados[3]));
					Cliente.mapaClientes.put(dados[2], c);
					
				}else if (dados[0].equalsIgnoreCase("GERENTE")) {}
				else if (dados[0].equalsIgnoreCase("DIRETOR")) {}
				else if (dados[0].equalsIgnoreCase("PRESIDENTE")) {}

			} else {
				break;
			}
		}
		System.out.println(Conta.mapaContas);
		
		// fechar o buff
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		// defino o tipo que vai ser escrito
		String input;
		Scanner sc = new Scanner(System.in);

		// abre a permissão de escrita
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		// recebo os dados do usuário
		System.out.println("Escreva algo: ");
		input = sc.nextLine();

		// coloco o que eu recebi no arquivo
		buffWriter.append(input + "\n");

		// fechar o scan e a permissao
		sc.close();
		buffWriter.close();
	}
//comprovante de saque
	public static void comprovanteSaque(Conta conta, Double valor) throws IOException {
		String path = conta.getTipoConta() + " " + conta.getCpfTitular();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + path +EXTENSAO, true));
		
		//Opção 1 de escrita do relatório
		
		String linha = "****************** SAQUE ******************";
		buffWrite.append(linha + "\n");
		
		linha = "CPF: " + conta.getCpfTitular();
		buffWrite.append(linha + "\n");
		
		linha = "Conta: " + conta.getNumConta();
		buffWrite.append(linha + "\n");
		
		linha = "Valor do Saque: " + valor;
		buffWrite.append(linha + "\n");
		
		//colocar hora e data
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		linha = "Operação realizada em: " + dtf.format(dataHora);
		buffWrite.append(linha + "\n");
		
		linha = "****************** FIM SAQUE ******************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
		
//		//Opção 2 de escrita
//		
//		buffWrite.append("****************** SAQUE ******************" + "\n");
//		buffWrite.append("CPF: "+ conta.getCpfTitular() + "\n");
//		buffWrite.append("Conta: " + conta.getNumConta() + "\n");
//		buffWrite.append("Valor do Saque: " + valor + "\n");
//		buffWrite.append("****************** FIM SAQUE ******************"+ "\n");
//		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
