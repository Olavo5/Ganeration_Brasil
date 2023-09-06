package semana3;

import java.util.Stack;
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<>();
		Scanner ler = new Scanner(System.in);

		
		String nomeLivro;

		pilha.add("Java Para Leigos");
		pilha.add("Memórias póstumas de Brás Cuba");
		pilha.add("Código Limpo");
		pilha.add("O Curtiço");
		
		
		int opcao;
		
		do {
			System.out.println(" 1: Adicionar livro na pilha. ");
			System.out.println(" 2: Listar todos os livros.");
			System.out.println(" 3: Retirar livro da pilha ");
			System.out.println(" 0: Sair  ");

			System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine(); 
			
			
			
			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do livro: ");
				nomeLivro = ler.nextLine();
				pilha.push(nomeLivro);
				System.out.println(pilha);
				break;

			case 2:
                System.out.println("Listar os livros: " + pilha);
                break;
            case 3:
                if (!pilha.isEmpty()) {
                    System.out.println("O cliente foi retirado: " + pilha.pop());
                    System.out.println(pilha);
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

