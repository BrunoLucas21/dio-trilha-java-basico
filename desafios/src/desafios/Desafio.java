package desafios;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leitorDeEntradas = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		float valorSalario = leitorDeEntradas.nextFloat();
		System.out.println("Digite o benefício: ");
		float valorBeneficios = leitorDeEntradas.nextFloat();
		
		float valorImposto = 0;
		if (valorSalario >= 0 && valorSalario <= 1100) {
			valorImposto = 0.05F * valorSalario;
		} else if (valorSalario >= 1100 && valorSalario <= 2500) {
			valorImposto = 0.10F * valorSalario;
		} else {
			valorImposto = 0.15F * valorSalario;
		}
		
		float saida = valorSalario - valorImposto + valorBeneficios;
		System.out.println(String.format("%.2f", saida));
		leitorDeEntradas.close();
	}
}
