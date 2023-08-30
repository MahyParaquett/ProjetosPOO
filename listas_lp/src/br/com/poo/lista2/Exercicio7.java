/*O programa “Estudo da Madrugada” irá calcular a porcentagem de
estudantes que estudam durante a madrugada. Para isso, o assistente
administrativo irá interagir com o programa. 
1-Primeiro ele deve perguntar ao assistente quantos estudantes têm na turma. ok
2- Após, com base em estudos anteriores, o assistente verificou que, na primeira disciplina da
residência, 35% dos estudantes estudam de madrugada e na segunda
disciplina, esse valor sobe 30%. 
3- Ao considerar a média das duas disciplinas e a quantidade de estudantes da turma, o programa deve informar ao
assistente quantos estudantes, em média, estudam de madrugada nas
duas primeiras disciplinas.*/
package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		float n;
		float d1;
		float d2;
		float media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o número de alunos? ");
		n = sc.nextFloat();
		sc.close();
		d1 = n*35/100;
		d2= d1*30/100;
		media = (d1+d2)/2;
		System.out.println("A média de estudantes que estudam de madrugada é:"+ media +"alunos\n");
		
		

	}

}
