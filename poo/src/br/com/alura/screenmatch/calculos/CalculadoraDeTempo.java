package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Titulo;

import java.util.concurrent.TimeUnit;

public class CalculadoraDeTempo {
    private int tempoTotal = 0 ;

    public int getTempoTotal() {
        return tempoTotal;
    }

   public void inclui (Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
   }

   // Para o design fica de classes, utilizei a Superclass para ser chamada como parametro.
   // Senao teria que criar 2 metodos para incluir, fazendo com que aconteça a sobrecarga de metodos.

//    public void inclui (Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
}
