package semana3;

import java.util.Scanner;

public class ArrayVetor1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetorNumeros = { 1, 2, 9, 6, 7, 8, 3, 4, 5, 10 };

		int index = -1;

		System.out.println("\nDigite o numero que quer saber: ");
		int numDigitado = ler.nextInt();

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] == numDigitado) {
				index = i;
				break;
			}

		}
		if (index != -1) {
			System.out.println("O número " + numDigitado + " se encontra na posição " + index);
		} else {
			System.out.println("O número " + numDigitado + " não foi encontrado!");
		}
	ler.close();
	}
}
