package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // CONSTRUTOR
    public Filme(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }


    //GETTERS E SETTERS
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // METODOS
    @Override
    public int getClassificao() {
        return (int) mediaDasAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " +this.getNome() + "(" + this.getAnoDelancamento() + ")";
    }
}
