package semana3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsList {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite as cores: ");

		while (true) {
			String cor = ler.nextLine();
			
			
			if (cor.equalsIgnoreCase("fim")) {
				System.out.println("Listar todas as cores: "+cores);
				Collections.sort(cores);
				break;

			}
			cores.add(cor);
		}
		System.out.println("Cores ordenadas: "+cores);
	ler.close();
	}

}
