package exercicio03;

public record Quadrado(double lado) implements FormaGeometrica {

	@Override
	public double area() {
		return lado * lado;
	}

}
