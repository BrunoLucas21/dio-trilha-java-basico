public class AparelhoTelefonico implements IPhone {
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero + "...");
  }

  public void atender() {
    System.out.println("Atendendo chamada...");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }
}
