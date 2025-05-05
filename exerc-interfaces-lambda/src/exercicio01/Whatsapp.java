package exercicio01;

public record Whatsapp(String mensagem) implements ServicoMarketing {

	@Override
	public String enviarMensagem(String mensagem) {
		mensagem = "Mensagem do Whatsapp";
		return mensagem;
	}

}
