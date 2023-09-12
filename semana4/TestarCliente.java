package semana4;

import java.util.Scanner;

public class TestarCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		System.out.println("*******************************");
		System.out.println("   Cadastro de clientes");
		System.out.println("*******************************");

		System.out.println("Primeiro Cliente");
		System.out.println("\nDigite o none: ");
		cliente1.setNome(ler.nextLine());
		ler.nextLine();

		System.out.println("\nDigite o seu CPF: ");
		cliente1.setCpf(ler.nextInt());
		ler.nextLine();

		System.out.println("\nDigite a sua idade: ");
		cliente1.setIdade(ler.nextInt());
		ler.nextLine();

		System.out.println("\nDigite o número do seu telefone: ");
		cliente1.setTelefone(ler.nextInt());
		ler.nextLine();

		System.out.println("\nDigite o seu endereço: ");
		cliente1.setEndereco(ler.nextLine());

		System.out.println("*******************************");
		System.out.println("*******************************");

		System.out.println("Segundo Cliente");
		System.out.println("\nDigite o none: ");
		cliente2.setNome(ler.nextLine());
		ler.nextLine();

		System.out.println("\nDigite o seu CPF: ");
		cliente2.setCpf(ler.nextInt());
		ler.nextLine();

		System.out.println("\nDigite a sua idade: ");
		cliente2.setIdade(ler.nextInt());
		ler.nextLine();

		System.out.println("\nDigite o número do seu telefone: ");
		cliente2.setTelefone(ler.nextInt());
		ler.nextLine();

		System.out.println("\nDigite o seu endereço: ");
		cliente2.setEndereco(ler.nextLine());

		System.out.println("*******************************");
		cliente1.Visualizar();
		System.out.println("*******************************");
		cliente2.Visualizar();
		System.out.println("*******************************");

		ler.close();
	}

}
