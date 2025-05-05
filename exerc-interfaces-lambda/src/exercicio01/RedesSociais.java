package exercicio01;

public record RedesSociais(String mensagem) implements ServicoMarketing {

	@Override
	public String enviarMensagem(String mensagem) {
		mensagem = "Mensagem da Rede Social";
		return mensagem;
	}

}
