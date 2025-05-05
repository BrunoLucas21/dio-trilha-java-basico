package exercicio02;

public record Vestuario(double imposto) implements TributacaoProdutos {

	@Override
	public double calcularValorTributo() {
		return imposto * 0.25;
	}

}
