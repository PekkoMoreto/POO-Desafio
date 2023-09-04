package iPhone;

import iPhone.aparelhoTelefonico.AparelhoTelefonico;
import iPhone.navegadorInternet.NavegadorInternet;
import iPhone.reprodutorMusical.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com a página: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }
}

