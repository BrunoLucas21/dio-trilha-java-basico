package exercicio02;

public record Alimentacao(double imposto) implements TributacaoProdutos {

	@Override
	public double calcularValorTributo() {
		return imposto * 0.1;
	}

}
