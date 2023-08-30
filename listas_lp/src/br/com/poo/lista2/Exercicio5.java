package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int hora;
		int conversao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor que represente a hora: ");
		hora =  sc.nextInt();
		sc.close();
		
		if(hora<0) {
			System.out.println("Hora inválida. Digite um número positivo\n");
		}
		conversao = hora*3600;
		
		System.out.println("\n\nPara converter para segundos basta fazer essa operação: hora*3600");
		System.out.println("Logo o resultado para a hora escolhida é:"+  conversao +" segundos");
	}

}
