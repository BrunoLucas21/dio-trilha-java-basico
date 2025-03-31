import java.util.Scanner;

public class CaixaEletronico {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu saldo na carteira: ");
    double saldo = sc.nextDouble();
    System.out.println("Digite o valor a ser solicitado: ");
    double valorSolicitado = sc.nextDouble();

    if (valorSolicitado < saldo) {
      saldo = saldo - valorSolicitado;
      System.out.println("Saldo atual: " + saldo);
    } else {
      System.out.println("Saldo insuficiente");
    }

    sc.close();

  }
}