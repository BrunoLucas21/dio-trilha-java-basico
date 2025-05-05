public class App {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        aparelho.ligar("123456789");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        System.out.println("-----------------");
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        System.out.println("-----------------");
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Minha Música Favorita");     
    }
}
