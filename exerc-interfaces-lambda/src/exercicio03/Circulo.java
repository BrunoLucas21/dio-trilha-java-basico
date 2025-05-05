package exercicio03;

public record Circulo(double raio) implements FormaGeometrica {

	private static final double pi = 3.14;

	@Override
	public double area() {
		return pi * (raio * raio);
	}
}
