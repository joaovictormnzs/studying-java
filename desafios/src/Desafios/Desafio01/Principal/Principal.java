package Desafios.Desafio01.Principal;

import Desafios.Desafio01.modelos.MinhasPreferidas;
import Desafios.Desafio01.modelos.Musica;
import Desafios.Desafio01.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Everywhere, Everthing");
        minhaMusica.setCantor("Noah Kahan");
        minhaMusica.setGenero("Folk");
        minhaMusica.setAlbum("Stick Season");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 3000; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Aqueles caras");
        meuPodcast.setApresentador("Chico Moedas");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
