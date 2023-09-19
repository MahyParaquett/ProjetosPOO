package br.com.poo.TrabIndividual;

import java.util.HashMap;
import java.util.Map;

public class Denuncia {
//Atributos
	
	private Integer numDelegacia;
	private String vitima;
	private String agressor;
	private String local;
	private String dataCaso;
	
//criar map
	public static Map<Integer, Denuncia> mapaDenuncia = new HashMap<>();
	
//Contrutor
	
	public Denuncia() {
		
	}
	
	
	public Denuncia(Integer numDelegacia, String vitima, String agressor, String local, String dataCaso) {
		
		this.numDelegacia = numDelegacia;
		this.vitima = vitima;
		this.agressor = agressor;
		this.local = local;
		this.dataCaso = dataCaso;
	}

	//get e set

	public String getVitima() {
		return vitima;
	}


	public void setVitima(String vitima) {
		this.vitima = vitima;
	}


	public String getAgressor() {
		return agressor;
	}


	public void setAgressor(String agressor) {
		this.agressor = agressor;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String getDataCaso() {
		return dataCaso;
	}


	public void setDataCaso(String dataCaso) {
		this.dataCaso = dataCaso;
	}


	public Integer getNumDelegacia() {
		return numDelegacia;
	}


	@Override
	public String toString() {
		return "\nDenuncia [numDelegacia=" + numDelegacia + ", vitima=" + vitima + ", agressor=" + agressor + ", local="
				+ local + ", dataCaso=" + dataCaso + "]";
	}

	
	
	
}
