package iPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Demonstração de funcionalidades
        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();

        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba("www.novaaba.com");
        iphone.atualizarPagina();
    }
}
