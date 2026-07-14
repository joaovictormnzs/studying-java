import br.com.alura.screenmatch.models.Filme;

public class Principal {
    public static void main(String[] args) {

        // --> Instanciando o objeto
        Filme onePiece = new Filme();
        onePiece.setNome("One Piece");
        onePiece.setAnoDelancamento(2000);
        onePiece.setDuracaoEmMinutos(120);

        onePiece.exibeFichaTecnica();
        onePiece.avalia(8);
        onePiece.avalia(9.5);
        onePiece.avalia(10);
        onePiece.avalia(9);
        System.out.println("Total de avaliações: " + onePiece.getTotalDeAvaliacoes());
        System.out.println(onePiece.mediaDasAvaliacoes());
    }
}
