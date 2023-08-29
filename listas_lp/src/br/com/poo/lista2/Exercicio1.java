/*1- Criar o programa “Qual o significado da vida, do universo e tudo mais?”. 
 * 2- Ao clicar, deve aparecer no console o número do universo  (razão aurea? 1,618).
 * 3-O programa terá uma constante Inteira, com identificador “UNIVERSO”,
onde você irá atribuir o número em questão. 
 *4- Após a atribuição, escreva na tela o conteúdo da variável.*/
package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		char resposta;
		int universo = 42;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(universo+"\n");
		System.out.println("Você sabe o que esse numero significa? Digite 's' para sim e 'n' para não\n");
		resposta = sc.next().charAt(0);
		
		sc. close();
		
		switch (resposta) {
		case 'S':
			System.out.println("\nParabéns! você conhece a razão do universo!");
			break;
		case 's':
			System.out.println("\nParabéns! você conhece a razão do universo!");
			break;	
		case 'n':
			System.out.println("\nEste é o número de referencia do livro O mochileiro da galaxia.");
			break;
		case 'N':
			System.out.println("\nEste é o número de referencia do livro O mochileiro da galaxia.");
			break;	
			
		default:
			System.out.println("\nOps! você não escolheu uma letra válida!");
			break;
		}
		

	}

}
