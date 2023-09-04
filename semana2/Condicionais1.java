package semana2;

import java.util.Scanner;

public class Condicionais1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int A, B, C, somaAB;

		System.out.println("Digite um número para A: ");
		A = ler.nextInt();

		System.out.println("Digite um número para B: ");
		B = ler.nextInt();

		System.out.println("Digite um número para C: ");
		C = ler.nextInt();

		somaAB = A + B;

		if (somaAB >= C) {
			System.out.printf(A + " + " + B + " = " + somaAB + " > " + C);
			System.out.println("\nA Soma de A + B é Maior do que C ");

		} else if (somaAB <= C) {
			System.out.printf(A + " + " + B + " = " + somaAB + " < " + C);
			System.out.println("\nA Soma de A + B é Menor do que C ");
		} else if (somaAB == C) {
			System.out.printf(A + " + " + B + " = " + somaAB + " = " + C);
			System.out.println("\nA Soma de A + B é Igual do que C ");
		}
		
		ler.close();
	}
}