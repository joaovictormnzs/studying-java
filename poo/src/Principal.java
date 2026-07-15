import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {

        // --> Instanciando o objeto
        Filme onePiece = new Filme();
        onePiece.setNome("One Piece");
        onePiece.setAnoDelancamento(2000);
        onePiece.setDuracaoEmMinutos(120);
        onePiece.exibeFichaTecnica();

        Filme questaoDeTempo = new Filme();
        questaoDeTempo.setNome("Questao de tempo");
        questaoDeTempo.setAnoDelancamento(2010);
        questaoDeTempo.setDuracaoEmMinutos(120);
        questaoDeTempo.exibeFichaTecnica();

        Serie supernatural = new Serie();
        supernatural.setNome("Supernatural");
        supernatural.setAnoDelancamento(2000);
        supernatural.exibeFichaTecnica();
        supernatural.setTemporadas(17);
        supernatural.setEpisodiosPorTemporada(24);
        supernatural.setMinutosPorEpisodio(44);
        System.out.println("Duraçao para maratonar Supernatural: " + supernatural.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(onePiece);
        calculadora.inclui(questaoDeTempo);
        calculadora.inclui(supernatural);
        System.out.println(calculadora.getTempoTotal());


    }

}
