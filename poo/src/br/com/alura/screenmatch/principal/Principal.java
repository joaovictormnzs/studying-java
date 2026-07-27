package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // --> Instanciando o objeto
        Filme onePiece = new Filme("One Piece", 2000);
        onePiece.setDuracaoEmMinutos(120);
        onePiece.exibeFichaTecnica();

        Filme questaoDeTempo = new Filme("Questao de tempo", 2010);
        questaoDeTempo.setDuracaoEmMinutos(120);
        questaoDeTempo.exibeFichaTecnica();

        Serie supernatural = new Serie("Supernatural", 2000);
        supernatural.exibeFichaTecnica();
        supernatural.setTemporadas(17);
        supernatural.setEpisodiosPorTemporada(24);
        supernatural.setMinutosPorEpisodio(44);
        System.out.println("\nDuraçao para maratonar Supernatural: " + supernatural.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(onePiece);
        calculadora.inclui(questaoDeTempo);
        calculadora.inclui(supernatural);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(onePiece);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(supernatural);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(onePiece);
        listaDeFilmes.add(questaoDeTempo);

        System.out.println("\nTamanho da Lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);

    }

}
