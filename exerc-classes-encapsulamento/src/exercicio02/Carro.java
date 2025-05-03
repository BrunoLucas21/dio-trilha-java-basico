package exercicio02;

public class Carro {

	private int velocidade;
	private int marcha;
	private boolean ligado;

	public Carro() {
		this.velocidade = 0;
		this.marcha = 0;
		this.ligado = false;
	}
	
	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("Carro ligado!");
		} else {
			System.out.println("Carro já está ligado!");
		}
	}
	
	public void desligar() {
		if (!ligado) {
			System.out.println("Carro já está desligado");
		} else if (marcha == 0 && velocidade == 0) {
			ligado = false;
			System.out.println("Carro desligado");
		} else {
			System.out.println("O carro só pode ser desligado em ponto morto e com velocidade 0!");
		}
	}
	
	public void acelerar() {
		if (!ligado) {
			System.out.println("Carro está desligado");
			return;
		}
		if (marcha == 0) {
			System.out.println("Carro está em ponto morto! Troque a marcha.");
			return;
		}
		if (velocidade >= 120) {
			System.out.println("Velocidade máxima atingida!");
			return;
		}
		
		// Verifica se a nova velocidade está dentro do limite da marcha atual
		int novaVelocidade = velocidade + 1;
		if (verificarLimiteVelocidade(novaVelocidade, marcha)) {
			velocidade = novaVelocidade;
			System.out.println("Acelerando... Velocidade atual: " + velocidade + "km/h");
		} else {
			System.out.println("Velocidade fora do limite para a marcha " + marcha + "! Troque a marcha.");
		}
	}
	
	public void diminuirVelocidade() {
		if (!ligado) {
			System.out.println("Carro está desligado!");
			return;
		}
		if (velocidade <= 0) {
			System.out.println("Carro já está parado!");
			return;
		}
		
		velocidade--;
		System.out.println("Reduzindo velocidade... Velocidade atual: " + velocidade + "km/h");
	}
	
	public void virar(String direcao) {
		if (!ligado) {
			System.out.println("Carro está desligado");
			return;
		}
		if (velocidade < 1 || velocidade > 40) {
			System.out.println("O carro só pode virar com velocidade entre 1km/h e 40km/h");
			return;
		}
		
		if (direcao.equalsIgnoreCase("esquerda")) {
			System.out.println("Virando para a esqueda!");
		} else if (direcao.equalsIgnoreCase("direita")) {
			System.out.println("Virando para a direita!");
		} else {
			System.out.println("Direção inválida! Use 'esquerda' ou 'direita'.");
		}
	}
	
	public int verificarVelocidade() {
		return velocidade;
	}
	
	public void trocarMarcha(int novaMarcha) {
		if (!ligado) {
			System.out.println("Carro está desligado");
			return;
		}
		if (novaMarcha < 0 || novaMarcha > 6) {
			System.out.println("Marcha inválida! Use marchas de 0 a 6.");
			return;
		}
		if (Math.abs(novaMarcha - marcha) > 1) {
			System.out.println("Não é permitido pular marchas!");
			return;
		}
		
		if (verificarLimiteVelocidade(velocidade, novaMarcha)) {
            marcha = novaMarcha;
            System.out.println("Marcha trocada para: " + (marcha == 0 ? "ponto morto" : marcha));
        } else {
            System.out.println("Velocidade incompatível com a marcha " + novaMarcha + "!");
        }
	}
	
	private boolean verificarLimiteVelocidade(int vel, int mar) {
        switch (mar) {
            case 0:
                return vel == 0;
            case 1:
                return vel >= 0 && vel <= 20;
            case 2:
                return vel >= 21 && vel <= 40;
            case 3:
                return vel >= 41 && vel <= 60;
            case 4:
                return vel >= 61 && vel <= 80;
            case 5:
                return vel >= 81 && vel <= 100;
            case 6:
                return vel >= 101 && vel <= 120;
            default:
                return false;
        }
    }
	
}
