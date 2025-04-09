import java.util.Random;

public class ExemploDoWhile {
  public static void main(String[] args) {
    System.out.println("Discando...");

    do {
      System.out.println("Chamando...");
      try {
        Thread.sleep(1000); // Simula o tempo de espera
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } while (tocando());

    System.out.println("Alô !!!");
  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println("Atendeu? " + atendeu);
    return ! atendeu;
  }
}
