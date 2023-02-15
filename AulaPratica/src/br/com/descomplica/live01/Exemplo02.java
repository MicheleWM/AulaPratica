package br.com.descomplica.live01;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		// declaração das variáveis:
		String nome;
		char sexo;
		byte idade;
		double peso;
		//entrada dos dados:
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite o seu nome: ");
			nome = entrada.nextLine();
			System.out.println("Digite sua idade: ");
			idade = entrada.nextByte();
			System.out.println("Digite seu peso: ");
			peso = entrada.nextDouble();
			System.out.println("Digite seu sexo: ");
			sexo = entrada.next().charAt(0);
		}
		//saída:
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso " + peso);
	

	} 
	

}