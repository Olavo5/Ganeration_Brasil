package semana2;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valorTotal, quantidade, preço;
		int opcao;

		
		System.out.println("_____________   ####   Menu   ####    __________________");
		System.out.println("\n--| CÓDIGO |          PRODUTO      | PREÇO UNITÁRIO|--");
		System.out.println("\n--|   1    |     Cachorro Quente   |    R$ 10.00   |--");
		System.out.println("\n--|   2    |     X-Salada          |    R$ 15.00   |--");
		System.out.println("\n--|   3    |     X-Bacon           |    R$ 18.00   |--");
		System.out.println("\n--|   4    |     Bauru             |    R$ 12.00   |--");
		System.out.println("\n--|   5    |     Refrigerante      |    R$ 8.00    |--");
		System.out.println("\n--|   6    |     Suco de laranja   |    R$ 13.00   |--");
		System.out.println("     ________________________________________________");
		
		System.out.println("\n Digite o código do produto, por favor.");
		opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite a quantidade: ");
			quantidade = ler.nextFloat();
			preço = 10.00;
			valorTotal = preço * quantidade;
			System.out.println("Produto: Cachorro Quente. Qtd: "+quantidade+" Preço: R$ "+preço+" Valor Total: R$ "+valorTotal);
			break;

		case 2:
			System.out.println("Digite a quantidade: ");
			quantidade = ler.nextFloat();
			preço = 15.00;
			valorTotal = preço * quantidade;
			System.out.println("Produto: X-Salada. Qtd: "+quantidade+" Preço: R$ "+preço+" Valor Total: R$ "+valorTotal);
			break;
			
		case 3:
			System.out.println("Digite a quantidade: ");
			quantidade = ler.nextFloat();
			preço = 18.00;
			valorTotal = preço * quantidade;
			System.out.println("Produto: X-Bacon. Qtd: "+quantidade+" Preço: R$ "+preço+" Valor Total: R$ "+valorTotal);
			break;
			
		case 4:
			System.out.println("Digite a quantidade: ");
			quantidade = ler.nextFloat();
			preço = 12.00;
			valorTotal = preço * quantidade;
			System.out.println("Produto: Bauru. Qtd: "+quantidade+" Preço: R$ "+preço+" Valor Total: R$ "+valorTotal);
			break;
			
		case 5:
			System.out.println("Digite a quantidade: ");
			quantidade = ler.nextFloat();
			preço = 8.00;
			valorTotal = preço * quantidade;
			System.out.println("Produto: Refrigerante. Qtd: "+quantidade+" Preço: R$ "+preço+" Valor Total: R$ "+valorTotal);
			break;
			
		case 6:
			System.out.println("Digite a quantidade: ");
			quantidade = ler.nextFloat();
			preço = 13.00;
			valorTotal = preço * quantidade;
			System.out.println("Produto: Suco de laranja. Qtd: "+quantidade+" Preço: R$ "+preço+" Valor Total: R$ "+valorTotal);
			break;
			
		
		}
	ler.close();
	}
	
}