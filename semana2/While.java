package semana2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		int menorQue21 = 0;
		int maiorQue50 = 0;
		int contador = 0;

		while (contador <= 9) {
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			if (idade <= 21) {
				menorQue21++;

			} else if (idade >= 50) {
				maiorQue50++;

			}
			contador++;

		}
		System.out.println("Total de pessoas menores de 21 anos: " + menorQue21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);
		ler.close();
	}
}