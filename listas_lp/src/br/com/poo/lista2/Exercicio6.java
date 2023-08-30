/*O sistema “Múltiplos de 6” irá pedir ao usuário um intervalo, maior que 100,
de valores inteiros. Após, irá somar os três primeiros com os três últimos
múltiplos de 6 desse intervalo. Ao final, imprime os múltiplos e o resultado
da soma.*/
package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int a;
		int contador=0;
		int soma1=0;
		int soma2=0;
		int somaTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro maior que 100: ");
		a = sc.nextInt();
		sc.close();
		if(a<100) {
			System.out.println("Você digitou um numero inválido\n");
		} else {
			System.out.println("Os três primeros números são: ");
			for (int i = 1; i<=a; i++) {
				if(i%6==0 && contador<3) {
					System.out.println(""+ i);
					soma1 += i;
					contador ++;
				}
			}
			System.out.println("\nos três ultimos números são: ");
			for (int i = a; i>=0; i--) {
				if(i%6==0 && contador>0) {
					System.out.println(""+ i);
					soma2 += i;
					contador --;
				}
			}
			somaTotal = soma1 + soma2;
			System.out.println("\nA soma entre os três primeiros e os três ultimos números é: "+ somaTotal +"\n");
		}
	}

}
