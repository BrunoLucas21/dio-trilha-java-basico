package exercicio03;

public record Retangulo(double altura, double base) implements FormaGeometrica {

	@Override
	public double area() {
		return altura * base;
	}

}
