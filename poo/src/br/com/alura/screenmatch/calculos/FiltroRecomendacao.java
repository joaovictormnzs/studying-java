package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificao() >= 4) {
            System.out.println("\nEsta entre os preferidos do momento");
        } else if (classificavel.getClassificao() >= 2 ) {
            System.out.println("\nMuito bem avaliado no momento!");
        } else {
            System.out.println("\nColoque na sua lista para assistir depois!");
        }
    }
}
