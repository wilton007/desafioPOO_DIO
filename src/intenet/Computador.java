package intenet;

import intenet.NavegadorNaInternet;

public class Computador implements NavegadorNaInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Pagica Exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagica Atualizada");

    }
}
