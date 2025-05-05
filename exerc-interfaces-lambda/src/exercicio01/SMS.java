package exercicio01;

public record SMS(String mensagem) implements ServicoMarketing {

	@Override
	public String enviarMensagem(String mensagem) {
		mensagem = "Mensagem do SMS";
		return mensagem;
	}

}
