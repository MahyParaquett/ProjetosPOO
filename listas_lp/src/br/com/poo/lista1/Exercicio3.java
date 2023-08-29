/*Lista 1- atividade 3
 * Etapas:
 *  1-perguntar um numero inteiro
 *  2-perguntar outro numero inteiro
 *  3- somar
 *  4-subtrair
 *  5-multiplicar
 *  6-dividir
 */
package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {
	
	
	public static void main(String[] args) {
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um numero inteiro: ");
		x = sc.nextInt();
		
		System.out.println("Escreva outro numero inteiro: ");
		y = sc.nextInt();
		
		sc.close();
		limpa();
		
		System.out.println("A soma desses números é "+ (x+y) +"\n");
		System.out.println("A subtração desses números é "+ (x-y) +"\n");
		System.out.println("A multiplicação desses números é "+ (x*y) +"\n");
		System.out.println("A divisão desses números é "+ (x/y) +"\n");	
	}
	
	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}

}
