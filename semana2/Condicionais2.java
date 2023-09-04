package semana2;

import java.util.Scanner;

public class Condicionais2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = ler.nextInt();

		if (numero % 2 != 0 && numero > 0) {
			System.out.println("Esse número é ímpar e positivo");
		}

		else if (numero % 2 != 0 && numero < 0) {
			System.out.println("Esse número é ímpar e negativo");
		}

		else if (numero % 2 == 0 && numero > 0) {
			System.out.println("Esse número é par e positivo");
		}

		else if (numero % 2 == 0 && numero < 0) {
			System.out.println("Esse número é par e negativo");
		}
		ler.close();
	}
}