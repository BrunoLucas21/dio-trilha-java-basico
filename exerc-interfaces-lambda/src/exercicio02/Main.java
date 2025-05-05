package exercicio02;

import java.util.Scanner;

public class Main {
	
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		TributacaoProdutos tributacaoProdutos;
		
		while(true) {
			System.out.println("Escolha umas das opções dos produtos");
			System.out.println("1 - Alimentação");
			System.out.println("2 - Saúde e Bem Estar");
			System.out.println("3 - Vestuário");
			System.out.println("4 - Cultura");
			System.out.println("5 - Sair");
			
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
				tributacaoProdutos = calcularImpostoAlimentacao();
			} else if (opcao == 2) {
				tributacaoProdutos = calcularImpostoSaudeBemEstar();
			} else if (opcao == 3) {
				tributacaoProdutos = calcularImpostoVestuario();
			} else if (opcao == 4) {
				tributacaoProdutos = calcularImpostoCultura();
			} else if (opcao == 5) {
				break;
			} else {
				System.out.println("Opção inválida!");
				continue;
			}
			System.out.println("O resultado do cálculo do imposto foi " + 
					tributacaoProdutos.calcularValorTributo());
		}
	}

	private static TributacaoProdutos calcularImpostoAlimentacao() {
		System.out.print("Informe o valor do produto: ");
		var alimentacao = scanner.nextDouble();
		return new Alimentacao(alimentacao);
	}
	
	private static TributacaoProdutos calcularImpostoSaudeBemEstar() {
		System.out.print("Informe o valor do produto: ");
		var saudeBemEstar = scanner.nextDouble();
		return new SaudeBemEstar(saudeBemEstar);
	}
	
	private static TributacaoProdutos calcularImpostoVestuario() {
		System.out.print("Informe o valor do produto: ");
		var vestuario = scanner.nextDouble();
		return new Vestuario(vestuario);
	}
	
	private static TributacaoProdutos calcularImpostoCultura() {
		System.out.print("Informe o valor do produto: ");
		var cultura = scanner.nextDouble();
		return new Cultura(cultura);
	}
}
