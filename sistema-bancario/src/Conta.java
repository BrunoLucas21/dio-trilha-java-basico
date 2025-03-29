import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta {
  
  protected Cliente cliente;
  protected int agencia;
  protected int numero;
  protected double saldo;
  protected List<Transacao> transacoes;

  public Conta(Cliente cliente, int agencia, int numero) {
    this.cliente = cliente;
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = 0.0;
    this.transacoes = new ArrayList<>();
  }

  public void depositar(double montante) {
    if (montante <= 0) {
      System.out.println("Valor de depósito inválido!");
      return;
    }

    saldo += montante;
    transacoes.add(new Transacao(new Date(), montante, "Depósito"));
    System.out.println("Depósito realizado com sucesso!");
  }

  public void sacar(double montante) {
    if (montante <= 0) {
      System.out.println("Valor de saque inválido!");
      return;
    }

    if (saldo >= montante) {
      saldo -= montante;
      transacoes.add(new Transacao(new Date(), -montante, "Saque"));
      System.out.println("Saque realizado com sucesso!");
    } else {
      System.out.println("Saldo insuficiente para saque!");
    }
  }

  public void transferir(double montante, Conta contaDestino) {
    if (montante <= 0) {
      System.out.println("Valor de transferência inválida!");
      return;
    }

    if (saldo >= montante) {
      saldo -= montante;
      contaDestino.saldo += montante;

      transacoes.add(new Transacao(new Date(), -montante, "Transferência para conta " + contaDestino.numero));
      contaDestino.transacoes.add(new Transacao(new Date(), montante, "Tranferência da conta " + this.numero));

      System.out.println("Tranferência realizada com sucesso!");
    } else {
      System.out.println("Saldo insuficiente para tranferência!");
    }
  }

  public void imprimirExtrato() {
    System.out.println("\n=== Extrato da Conta " + numero + " ===");
    System.out.println("Titular: " + cliente);
    System.out.println("Agência: " + agencia);
    System.out.println("Número: " + numero);
    System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    System.out.println("\nHistórico de Transações:");

    for (Transacao transacao : transacoes) {
      System.out.println(transacao);
    }
  }

  @Override
  public String toString() {
    return "Conta [agência= " + agencia + ", numero= " + numero + 
            ", saldo= " + saldo + ", titular= " + cliente + "]";
  }

  public double calcularDividaExponencial() {
    double valorParcela = 50.0;
    double valorMontante = 0.0;

    for (int x=1; x<=5; x++) {
      double valorCalculado = valorParcela * x;
      valorMontante = valorMontante + valorCalculado;
    }
    return valorMontante;
  }

  public abstract void aplicarTaxa();
}