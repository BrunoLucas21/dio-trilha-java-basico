package exercicio02;

public record Cultura(double imposto) implements TributacaoProdutos {

	@Override
	public double calcularValorTributo() {
		return imposto * 0.4;
	}

}
