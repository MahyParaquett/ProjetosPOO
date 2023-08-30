/*O programa "Triângulo" irá pedir três valores de ângulos e irá classificar os
triângulos em Acutângulo, Obtusângulo ou Retângulo (caso não se recorde
das classificações, pesquise por “classificação de triângulo em relação aos
ângulos”). Depois disso, escreva os ângulos e a classificação do triângulo.*/

/* acutangulo-> tres angulos menores que 90
 *  retangulo-> 1= 90  a soma deles é 180
 *  obtusangulo-> 1>90 e 2<90
 */

package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int soma;

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá bem vindo ao programa Triangulo!\n");
		System.out.println("Digite o valor do primeiro angulo: \n");
		a = sc.nextInt();
		System.out.println("Digite o valor do segundo angulo: \n");
		b = sc.nextInt();
		System.out.println("Digite o valor do terceiro angulo: \n");
		c = sc.nextInt();
		sc.close();
		limpa();

		soma = a + b + c;

		while (soma != 180) {
			if (soma != 180 || a == 0 || b == 0 || c == 0) {
				System.out.println("Os angulos internos somados não correspondem a 180º, tente novamente!\n\n");
				break;
			}
		}
		if (a < 90 && a > 0 && b < 90 && b > 0 && c < 90 && c > 0) {
			System.out.println("Esses angulos formam um triangulo acutangulo!\n");
		} else if (a == 90 || b == 90 || c == 90) {
			System.out.println("Esses angulos formam um triangulo retangulo!\n");
		} else if (a > 90 || b > 90 || c > 90 ) {
			System.out.println("Esses angulos formam um triangulo obtusangulo!\n");
		}

	}

	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}
