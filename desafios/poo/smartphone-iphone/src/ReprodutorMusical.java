public class ReprodutorMusical implements IPhone {
  public void tocar() {
    System.out.println("Tocando música...");
  }

  public void pausar() {
    System.out.println("Música pausada.");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Música selecionada: " + musica);
  }
}
