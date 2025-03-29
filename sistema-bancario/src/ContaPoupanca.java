import java.util.Date;

public class ContaPoupanca extends Conta {

  private double taxaRendimento;

  public ContaPoupanca(Cliente cliente, int agencia, int numero) {
    super(cliente, agencia, numero);
    this.taxaRendimento = 0.005; // 0.5% ao mês
  }

  public void aplicarRendimento() {
    double rendimento = saldo * taxaRendimento;
    saldo += rendimento;
    transacoes.add(new Transacao(new Date(), rendimento, "Rendimento poupança"));
    System.out.println("Rendimento aplicado: R$ " + String.format("%.2f", rendimento));
  }

  @Override
  public void aplicarTaxa() {
    // Conta poupança não tem taxa
  }

  @Override
  public String toString() {
    return super.toString() + " (Conta Poupança)";
  }
  
}
