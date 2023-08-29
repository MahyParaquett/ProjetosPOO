/*Escrever o programa “Minha Idade”. 
 * 1-O programa deve receber sua data de
nascimento e 
2-calcular sua idade.
3-Após, escreva a idade na tela.*/

package br.com.poo.lista2;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int ano;
		int idade;
		String nome;

		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("Olá! Qual o seu nome? \n");
		nome = sc.next();

		System.out.println("\n\nQual o dia do seu nascimento? Escreva nesse formato: dd:");
		dia = sc.nextInt();
		System.out.println("Qual o mês do seu nascimento? Escreva nesse formato: mm:");
		mes = sc.nextInt();
		System.out.println("Qual o ano do seu nascimento? Escreva nesse formato: aaaa:");
		ano = sc.nextInt();
		limpa();

		sc.close();

		idade = c.get(Calendar.YEAR) - ano;

		if ((dia > 31) || (mes > 12) || (ano > c.get(Calendar.YEAR))) {
			System.out.println("Ops! parece que voce digitou um número inválido\n");

		} else if ((dia <= 31) && (mes <= 12) && (c.get(Calendar.MONTH) < mes)) {
			System.out.println("Bem vindo(a) " + nome + " você tem " + (idade - 1) + " anos de idade!\n");

		} else if ((dia <= 31) && (mes <= 12) && c.get(Calendar.MONTH) == mes && c.get(Calendar.MONTH) > dia) {
			System.out.println("Bem vindo(a) " + nome + " você tem " + (idade - 1) + " anos de idade!\n");

		} else if (c.get(Calendar.MONTH) > mes) {
			System.out.println("Bem vindo(a) " + nome + " você tem " + idade + " anos de idade!\n");
		}
		if (c.get(Calendar.DATE) == dia && c.get(Calendar.MONTH) == mes) {
			System.out.println("Feliz aniversário!! " + nome + "\n");
		}

	}

	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}
