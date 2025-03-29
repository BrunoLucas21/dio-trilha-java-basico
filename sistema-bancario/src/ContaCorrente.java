import java.util.Date;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    private double taxaManutencao;
    
    public ContaCorrente(Cliente cliente, int agencia, int numero) {
        super(cliente, agencia, numero);
        this.limiteChequeEspecial = 1000;
        this.taxaManutencao = 20;
    }
    
    @Override
    public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteChequeEspecial;
        
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return;
        }
        
        if (saldoDisponivel >= valor) {
            saldo -= valor;
            transacoes.add(new Transacao(new Date(), -valor, "Saque"));
            System.out.println("Saque realizado com sucesso!");
            
            if (saldo < 0) {
                System.out.println("Atenção: Você está usando o cheque especial!");
            }
        } else {
            System.out.println("Saldo + limite insuficiente para saque!");
        }
    }
    
    @Override
    public void aplicarTaxa() {
        if (saldo < taxaManutencao) {
            System.out.println("Saldo insuficiente para cobrança de taxa de manutenção!");
        } else {
            saldo -= taxaManutencao;
            transacoes.add(new Transacao(new Date(), -taxaManutencao, "Taxa de manutenção"));
            System.out.println("Taxa de manutenção debitada: R$ " + taxaManutencao);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Conta Corrente)";
    }
}
