package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float numero1;
		float numero2;
		float soma;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = sc.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = sc.nextFloat();
		
		soma = numero1 + numero2;
		sc.close();
				
		System.out.println("A soma desses numeros é: "+ soma);
				
	}

}
