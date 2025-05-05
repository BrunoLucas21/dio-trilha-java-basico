package exercicio03;

import java.util.Scanner;

public class Main {

	private final static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;
		FormaGeometrica formaGeometrica;
		
		while (true) {
			System.out.println("Escolha a forma geométrica para calcular a área");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retângulo");
			System.out.println("3 - Circulo");
			System.out.println("4 - Sair");
			
			opcao = scanner.nextInt();
			
			if (opcao == 1) { 
				formaGeometrica = criarQuadrado();
			} else if (opcao == 2) { 
				formaGeometrica = criarRetangulo();
			} else if (opcao == 3) { 
				formaGeometrica = criarCirculo();
			} else if (opcao == 4) {
				break;
			} else {
				System.out.println("Opção inválida");
				continue;
			}
			System.out.println("O resultado do cálculo da área foi de " + formaGeometrica.area());
		}

	}
	
	private static FormaGeometrica criarQuadrado() {
		System.out.print("Informe os tamanho dos lados: ");
		var lado = scanner.nextDouble();
		return new Quadrado(lado);
	}
	
	private static FormaGeometrica criarRetangulo() {
		System.out.print("Informe a base: ");
		var base = scanner.nextDouble();
		System.out.print("Informe a altura: ");
		var altura = scanner.nextDouble();
		return new Retangulo(base, altura);
	}
	
	private static FormaGeometrica criarCirculo() {
		System.out.print("Informe o raio: ");
		var raio = scanner.nextDouble();
		return new Circulo(raio);
	}

}
