package semana2;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		int num1, num2, contador;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		num2 = leia.nextInt();

		if (num2 >= num1) {
			for (contador = num1; contador <= num2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}

			}

		} else {
			System.out.println("Intervalo inválido!");
		}
     leia.close();
	}
}

