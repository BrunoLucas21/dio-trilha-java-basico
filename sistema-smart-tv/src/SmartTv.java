public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  void mudarCanal(int novoCanal) {
    canal = novoCanal;
  }

  void aumentarCanal() {
    canal++;
  }

   void dminuirCanal() {
    canal--;
  }

  void aumentarVolume() {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  void diminuirVolume() {
    volume--;
    System.out.println("Dimnuindo o volume para: " + volume);
  }

  void ligar() {
    ligada = true;
  }

  void desligar() {
    ligada = false;
  }
}