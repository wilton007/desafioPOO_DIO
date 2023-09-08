package telefone;

import telefone.AparelhoTelefonico;

public class Celular implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendido");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Iniciado");
    }
}
