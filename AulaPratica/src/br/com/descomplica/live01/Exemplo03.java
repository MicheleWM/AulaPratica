package br.com.descomplica.live01;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		// declaração das variáveis:
		int n1, n2, soma, sub, mult;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número: ");
			n1 = entrada.nextInt();
			System.out.println("Digite o segundo número: ");
			n2 = entrada.nextInt();
		}
		//processamento:
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		//saída:
		System.out.println(n1 + " + " + n2 + "= " + soma);
		System.out.println(n1 + " - " + n2 + "= " + sub);
		System.out.println(n1 + " x " + n2 + "=" + mult);

	}

}

