package semana2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numInteiro, soma = 0;

		do {

			System.out.println("Digite um número: ");
			numInteiro = ler.nextInt();
			if (numInteiro > 0) {
				soma += numInteiro;
			}

		} while (numInteiro != 0);

		System.out.println("A soma de todos os números positivos é: " + soma);
		ler.close();
	}

}
