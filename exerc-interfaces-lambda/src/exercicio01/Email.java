package exercicio01;

public record Email(String mensagem) implements ServicoMarketing {

	@Override
	public String enviarMensagem(String mensagem) {
		mensagem = "Mensagem do E-mail";
		return mensagem;
	}

}
