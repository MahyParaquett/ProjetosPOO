/* Lista 1- atividade 1
 *  Etapas:
 *  1- perguntar o nome
 *  2-perguntar o sobrenome
 *  3-juntar nome e sobrenome em uma frase
 */
package br.com.poo.lista1;

//lista de bibliotecas
import java.util.Scanner;

//programa no portugol
public class Exercicio1 {

//funcao inicio no portugol
	public static void main(String[] args) {
		// definir variavel
		String nome;
		String sobrenome;

		// intancia
		Scanner sc = new Scanner(System.in);

		// funcao escreva no portugol
		System.out.println("Por favor, digite seu nome: ");

		// funcao leia
		nome = sc.nextLine();

		// laco de repeticao para limpar a tela
		for (int i = 0; i < 5; i++) {
			System.out.println();
		}
		// funcao escreva no portugol
		System.out.println("Agora, informe seu sobrenome: ");
		
		// funcao leia
		sobrenome = sc.nextLine();

		// tudo que abre tem que fechar
		sc.close();

		// funcao para limpar a tela
		limpa();
		
		// funcao escreva
		System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome);
	}
	public static void limpa() {
		for (int i = 0; i < 5; i++) {
			System.out.println();
		}
	}
}

