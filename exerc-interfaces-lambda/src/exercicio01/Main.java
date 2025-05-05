package exercicio01;

import java.util.Scanner;

public class Main {

	private final static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;
		ServicoMarketing servicoMarketing;
		
		while (true) {
			System.out.println("Escolha umas das opções dos Serviço de Marketing");
			System.out.println("1 - SMS");
			System.out.println("2 - E-mail");
			System.out.println("3 - Redes Sociais");
			System.out.println("4 - Whatsapp");
			System.out.println("5 - Sair");
			
			opcao = scanner.nextInt();
			String mensagem = "";
			
			if (opcao == 1) {
				servicoMarketing = enviarViaSMS();
			} else if (opcao == 2) {
				servicoMarketing = enviarViaEmail();
			} else if (opcao == 3) {
				servicoMarketing = enviarViaRedeSocial();
			} else if (opcao == 4) {
				servicoMarketing = enviarViaWhatsapp();
			} else if (opcao == 5) {
				break;
			} else {
				System.out.println("Opção inválida");
				continue;
			}
			System.out.println("A mensagem do serviço de marketing foi enviada através de "
					+ servicoMarketing.enviarMensagem(mensagem));
			System.out.println("=============== Serviço de Marketing ===================");
		}
		
	}
	
	private static ServicoMarketing enviarViaSMS() {
		System.out.println("Informe a mensagem que deseja enviar: ");
		var mensagemSMS = scanner.next();
		return new SMS(mensagemSMS);
	}
	
	private static ServicoMarketing enviarViaEmail() {
		System.out.println("Informe a mensagem que deseja enviar: ");
		var mensagemEmail = scanner.next();
		return new SMS(mensagemEmail);
	}
	
	private static ServicoMarketing enviarViaRedeSocial() {
		System.out.println("Informe a mensagem que deseja enviar: ");
		var msgRedeSocial = scanner.next();
		return new SMS(msgRedeSocial);
	}
	
	private static ServicoMarketing enviarViaWhatsapp() {
		System.out.println("Informe a mensagem que deseja enviar: ");
		var msgWhatsapp = scanner.next();
		return new SMS(msgWhatsapp);
	}
}
