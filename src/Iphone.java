import intenet.NavegadorNaInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void ligar() {
        System.out.println("Iphone Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Iphone Atendido");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Iphone Iniciado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina Web No Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta no Navegador do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo Musica no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone Pausado");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada no Iphone");
    }
}
