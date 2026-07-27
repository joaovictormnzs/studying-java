package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme onePiece = new Filme("One Piece", 2000);
        onePiece.avalia(10);
        Filme questaoDeTempo = new Filme("Questao de tempo", 2010);
        questaoDeTempo.avalia(10);
        Serie supernatural = new Serie("Supernatural", 2000);
        supernatural.avalia(9);


        //ARRAYS
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(onePiece);
        lista.add(questaoDeTempo);
        lista.add(supernatural);

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificao() > 2){
                //Filme filme = (Filme) item;
                System.out.println("Classificacao: " +filme.getClassificao()); // --> COM O CAST
                //System.out.println("Classificacao: " +item.getClassificao); --> SEM O CAST FILME
            }
        }

        System.out.println("Lista de Titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDelancamento));
        System.out.println("Ordenar por ano: ");
        System.out.println(lista);


    }

}
