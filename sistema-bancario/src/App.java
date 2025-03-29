public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("Banco Digital POO");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        // Criando contas
        Conta contaCorrente = new ContaCorrente(cliente1, 1001, 1234);
        Conta contaPoupanca = new ContaPoupanca(cliente2, 1001, 5678);

        // Adicionando contas ao banco
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Realizando operações
        contaCorrente.depositar(1000);
        contaCorrente.transferir(500, contaPoupanca);
        contaPoupanca.sacar(200);

        // Imprimindo extratos
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        // Listando contas do banco
        banco.listarContas();
    }
}
