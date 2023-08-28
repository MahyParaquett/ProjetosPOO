package br.com.poo.lista1;

import java.util.Scanner;

//programa no portugol
public class Exercicio1 {

//funcao inicio no portugol
	public static void main(String[] args) {
		// definir variavel
		String nome;
		String sobrenome;

		// importar biblioteca
		Scanner sc = new Scanner(System.in);

		// funcao escreva no portugol
		System.out.println("Por favor, digite seu nome: ");

		// preenchendo a variável com o que usuario colocar
		nome = sc.nextLine();

		// laco de repeticao para limpar a tela
		for (int i = 0; i < 5; i++) {
			System.out.println();
		}
		System.out.println("Agora, informe seu sobrenome: ");
		// funcao leia
		sobrenome = sc.nextLine();
		sc.close();

		// laco de repeticao para limpar a tela
		for (int i = 0; i < 5; i++) {
			System.out.println();
		}
		// funcao escreva
		System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome);
	}

}
