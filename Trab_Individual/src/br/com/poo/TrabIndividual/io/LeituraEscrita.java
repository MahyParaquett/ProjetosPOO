package br.com.poo.TrabIndividual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import br.com.poo.TrabIndividual.Delegacia;
import br.com.poo.TrabIndividual.Denuncia;

public class LeituraEscrita {
	// Contantes
	static final String PATH_BASICO = "./temp/";

	static final String EXTENSAO = ".txt";

	// LEITURA
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

				if (dados[0].equalsIgnoreCase("DelPM")) {
					// String tipo,Integer numDelegacia, String delegado, String policial, Integer
					// sala, String data) }
					Delegacia dl = new Delegacia(dados[0], Integer.parseInt(dados[1]), dados[2], dados[3],
							Integer.parseInt(dados[4]), dados[5]);
					Delegacia.mapaDelegacia.put(Integer.parseInt(dados[1]), dl);

					// Integer numDelegacia, String vitima, String agressor, String local, String
					// dataCaso
				} else if (dados[0].equals("123") || dados[0].equals("456") || dados[0].equals("789")
						|| dados[0].equals("741") || dados[0].equals("852")) {

					Denuncia dn = new Denuncia(Integer.parseInt(dados[0]), dados[1], dados[2], dados[3], dados[4]);
					Denuncia.mapaDenuncia.put(Integer.parseInt(dados[0]), dn);

				}
			} else {
				break;
			}

		}

		// fechar o buff
		buffRead.close();
	}

//ESCRITA
	public static void relatorioDenunciaxDelegado(String delegado) throws IOException {
		
		String path = "Relatorio_DenunciaxDelegado";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO));
		
		
		buffWrite.append("************* RELATORIO DE DENUNCIAS *************" + "\n");
		buffWrite.append("Delegado(a): " + delegado +"\n");
		buffWrite.append("Denuncias: " );
		buffWrite.append(Delegacia.localizar(delegado));

		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWrite.append("\nData da operação: " + dtf.format(dataHora) + "\n");
		buffWrite.append("************* FIM RELATORIO DE DENUNCIAS *************" + "\n");

		buffWrite.close();

	}
public static void relatorioCasoCasa() throws IOException {
		
		String path = "Relatorio_CasoCasa";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO));
		
		
		buffWrite.append("************* RELATORIO DE CASOS EM CASA *************" + "\n");
		buffWrite.append("casos:" );
		buffWrite.append(Denuncia.classificador());

		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWrite.append("\nData da operação: " + dtf.format(dataHora) + "\n");
		buffWrite.append("************* FIM RELATORIO DE CASOS EM CASA *************" + "\n");

		buffWrite.close();

	}
	
		
	}

	


