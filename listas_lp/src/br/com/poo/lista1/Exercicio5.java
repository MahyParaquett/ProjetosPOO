/*Lista 1- atividade 5
 * 1- atribuir a uma letra a formula
 * 2- atribuir a outra letra outra formula
 * 3- mostrar o primeiro resultado
 * 4- mostrar o segundo resultado
 */
package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int a=2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
		int b=2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
		int opcao;
		
		System.out.println("Qual das duas expressões você deseja resolver? Digite 1 ou 2\n");
		System.out.println("1- 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;\n");
		System.out.println("2-(2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9)\n");
		
		Scanner sc = new Scanner(System.in);
		opcao = sc.nextInt();
		sc.close();
		
		limpa();
		switch(opcao) {
		
		case 1:
			System.out.println("O resultado da expressão 1 é "+ a +"\n");
			break;
		case 2:
			System.out.println("O resultado da expressão 2 é "+ b);
			break;
		}
		
	}
	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}
