package semana3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner ler = new Scanner(System.in);

		
		String nomeCliente;

		fila.add("Ana");
		fila.add("Clara");
		fila.add("Bruno");
		fila.add("Lia");
		fila.add("João");
		
		int opcao;
		
		do {
			System.out.println(" 0: Sair ");
			System.out.println(" 1: Adcionar um cliente na fila");
			System.out.println(" 2: Listar todos os Clientes");
			System.out.println(" 3: O cliente foi chamado  ");

			System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine(); 
			
			
			
			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do cliente: ");
				nomeCliente = ler.nextLine();
				fila.offer(nomeCliente);
				System.out.println(fila);
				break;

			case 2:
                System.out.println("Listar todos os clientes: " + fila);
                break;
            case 3:
                if (!fila.isEmpty()) {
                    System.out.println("O cliente foi retirado: " + fila.poll());
                    System.out.println(fila);
                } else {
                    System.out.println("A fila está vazia.");
                }
                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
			}

		}while (opcao != 0);
		
		ler.close();

	}
}

