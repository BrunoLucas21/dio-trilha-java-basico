package exercicio01;

public class Main {

	public static void main(String[] args) {
		Conta jose = new Conta(400.00);
		System.out.println("Saldo: R$" + jose.consultarSaldo());
		System.out.println("Cheque especial disponível: R$" + jose.consultarChequeEspecial());
		jose.sacar(450.00);
		System.out.println("Usando cheque especial: " + jose.estaUsandoChequeEspecial());
		jose.depositar(100.00);
		System.out.println("Saldo após depósito: R$" + jose.consultarSaldo());
		System.out.println();
		Conta maria = new Conta(1000.00);
        System.out.println("\nSaldo: R$" + maria.consultarSaldo());
        System.out.println("Cheque especial disponível: R$" + maria.consultarChequeEspecial());
        maria.pagarBoleto(1200.00);
        System.out.println("Usando cheque especial: " + maria.estaUsandoChequeEspecial());
        maria.depositar(300.00);
        System.out.println("Saldo após depósito: R$" + maria.consultarSaldo());
	}

}
