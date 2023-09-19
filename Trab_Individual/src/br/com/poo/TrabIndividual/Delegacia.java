package br.com.poo.TrabIndividual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.TrabIndividual.util.Util;

public class Delegacia {

	// Atributos
	private String tipo;
	private Integer numDelegacia;
	private String delegado;
	private String policial;
	private Integer sala;
	private String data;

	// criar map
	public static Map<Integer, Delegacia> mapaDelegacia = new HashMap<>();

	// Contrutor
	public Delegacia() {
	}

	public Delegacia(String tipo, Integer numDelegacia, String delegado, String policial, Integer sala, String data) {

		this.tipo = tipo;
		this.numDelegacia = numDelegacia;
		this.delegado = delegado;
		this.policial = policial;
		this.sala = sala;
		this.data = data;
	}

	// get e set

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public Integer getNumDelegacia() {
		return numDelegacia;
	}

	public String getDelegado() {
		return delegado;
	}

	public String getPolicial() {
		return policial;
	}

	public String getData() {
		return data;
	}

	public String gettipo() {
		return tipo;
	}

	// MÉTODO PARA LOCALIZAR
	public static String localizar(String delegado) {
		Logger logger = Util.setupLogger();
		
		ArrayList<String> denuncias = new ArrayList<>();
		
		for (Map.Entry<Integer, Delegacia> delegacia : Delegacia.mapaDelegacia.entrySet()) {
			if (delegacia.getValue().getDelegado().equalsIgnoreCase(delegado)) {
				Denuncia dn = Denuncia.mapaDenuncia.get(delegacia.getValue().getNumDelegacia());
				logger.log(Level.INFO, () -> " " + dn);
				Util.customizer();
				denuncias.add(dn.toString());
			}	
			
		}
		return arrayToString(denuncias,"\n\n");
	}

	private static String arrayToString(ArrayList<String> denuncias, String string) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < denuncias.size(); i++) {
            resultado.append(denuncias.get(i));
            if (i < denuncias.size() - 1) {
                resultado.append(string);
            }
        }
		return resultado.toString();
	}

	@Override
	public String toString() {
		return "\nDelegacia [tipo=" + tipo + ", numDelegacia=" + numDelegacia + ", delegado=" + delegado + ", policial="
				+ policial + ", sala=" + sala + ", data=" + data + "]";
	}

}
