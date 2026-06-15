public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Questão de tempo");

        int anoDeLancamento = 2013;
        System.out.println("Ano do lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10.0;

        String sinopse = "Melhor filme de romance do mundo";
        System.out.println(sinopse);

        double media = (10.0 + 10.0 + 9.0 + 8.0) / 4;
        System.out.println("A media de avaliacoes é: "+media);

        int classificacao = (int )(media / 2) ;
        System.out.println(String.format("A classificacao desse filme é de %d estrelas", classificacao));

    }
}