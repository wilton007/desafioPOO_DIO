package musica;

import musica.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {


    @Override
    public void tocar() {
        System.out.println("Tacando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionada");
    }
}
