package exercicio01;

public class Conta {

	private double saldo;
	private double limiteChequeEspecial;
	private double valorUsadoChequeEspecial;
	private boolean usandoChequeEspecial;
	
	public Conta(double depositoInicial) {
		this.saldo = depositoInicial;
		this.valorUsadoChequeEspecial = 0;
		this.usandoChequeEspecial = false;
		
		if (depositoInicial <= 500.00) {
			this.limiteChequeEspecial = 50.00;
		} else {
			this.limiteChequeEspecial = depositoInicial * 0.5;
		}
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public double consultarChequeEspecial() {
		return limiteChequeEspecial - valorUsadoChequeEspecial;
	}
	
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de depósito inválido!");
			return;
		}
		
		// Se está usando cheque especial, primeiro repõe o cheque especial
		if (usandoChequeEspecial) {
			double valorParaRepor = Math.min(valor, valorUsadoChequeEspecial);
			valorUsadoChequeEspecial -= valorParaRepor;
			valor -= valorParaRepor;
			
			// Aplica taxa de 20% sobre o valor usado do cheque especial
			if (valorUsadoChequeEspecial == 0) {
				double taxa = valorParaRepor * 0.2;
				saldo -= taxa;
				System.out.println("Taxa de 20% do cheque especial cobrada: R$" + taxa);
				usandoChequeEspecial = false;
			}
		}
		
		// Deposita o restante no saldo
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
	}
	
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de saque inválido!");
			return;
		}
		
		double saldoTotalDisponivel = saldo + (limiteChequeEspecial - valorUsadoChequeEspecial);
		
		if (valor > saldoTotalDisponivel) {
			System.out.println("Saldo insuficiente, incluindo cheque especial!");
			return;
		}
		
		// Verificar se precisa usar o cheque especial
		if (valor > saldo) {
			double valorChequeEspecial = valor - saldo;
			valorUsadoChequeEspecial += valorChequeEspecial;
			saldo = 0;
			usandoChequeEspecial = true;
			System.out.println("Saque de R$" + valor + " realizado usando cheque especial!");
		} else {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso!");
		}
	}
	
	public void pagarBoleto(double valor) {
		if (valor <= 0) {
			System.out.println("Valor do boleto inválido!");
			return;
		}
		
		double saldoTotalDisponivel = saldo + (limiteChequeEspecial - valorUsadoChequeEspecial);
		
		if (valor > saldoTotalDisponivel) {
			System.out.println("Saldo insuficiente para pagar o boleto!");
			return;
		}
		
		// Verificar se precisa usar o cheque especial
		if (valor > saldo) {
			double valorChequeEspecial = valor - saldo;
			valorUsadoChequeEspecial += valorChequeEspecial;
			saldo = 0;
			usandoChequeEspecial = true;
			System.out.println("Boleto de R$" + valor + " pago usando cheque especial!");
		} else {
			saldo -= valor;
			System.out.println("Boleto de R$" + valor + " pago com sucesso!");
		}
	}
	
	public boolean estaUsandoChequeEspecial() {
		return usandoChequeEspecial;
	}
}
