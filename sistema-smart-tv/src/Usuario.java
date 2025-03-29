public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Está desligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.dminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(9);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
