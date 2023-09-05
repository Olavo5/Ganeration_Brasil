package semana3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class CollectionSet {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> numeroInteiroSet = new HashSet<>();
		ArrayList<Integer> numeroInteiroList = new ArrayList<>();

		System.out.println("\nDigite 10 valores inteiros não repetidos: ");

		for (int i = 0; i < 10;) {
			int numero = ler.nextInt();
			if (numeroInteiroSet.contains(numero)) {
				System.out.println("Este valor já foi inserido. Tente novamente.");
			}

			else {
				numeroInteiroSet.add(numero);
				numeroInteiroList.add(numero);
				i++;
			}
		}

		System.out.println("\nElementos na Collection Set: ");
		for (Integer elemento : numeroInteiroSet) {
		    System.out.println(elemento);
		}

		Collections.sort(numeroInteiroList);

		System.out.println("\nElementos na Collection List em ordem crescente: ");
		Iterator<Integer> iterator = numeroInteiroList.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}

		ler.close();
		
	}
}




