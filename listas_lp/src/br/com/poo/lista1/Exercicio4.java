/*Lista 1- atividade 4
 * Etapas:
 *  1-perguntar a temperatura em celsius
 *  2-colocar a formula de celsius para fahrenheit
 *  3- mostrar o resultado
 */
package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int c;
		int f;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em celsius: ");
		c = sc.nextInt();
		
		sc.close();
		
		f=(c*9/5)+32;
		
		System.out.println("\n\nA temperatura em fahrenheit é: "+ f + ""+"\n");
			
		
	}

}
