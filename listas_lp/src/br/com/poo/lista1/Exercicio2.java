/* Lista 1- atividade 2
 *  Etapas:
 *  1-perguntar a minha idade
 *  2-perguntar a idade do colega A
 *  3-perguntar a idade do colega B
 *  4-perguntar a idade do colega C
 *  5-perguntar a idade do colega D
 *  6-perguntar a idade do colega E
 *  7-somar as idades
 */

package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int suaIdade;
		int soma=0;
		int idades[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a sua idade? ");
		suaIdade = sc.nextInt();
		
		for (int i=0; i<5; i++) {
		System.out.println("Escreva qual é a idade do colega " + (i+1) +":");
		idades[i] = sc.nextInt();
		soma += idades[i];
		}
		sc.close();
		
		limpa();
		
		System.out.println("A soma dessas idades é: "+ (soma+suaIdade));
	}

	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
	
}
