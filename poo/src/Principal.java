public class Principal {
    public static void main(String[] args) {

        // --> Instanciando o objeto
        Filme onePiece = new Filme();
        onePiece.nome = "One Piece";
        onePiece.anoDelancamento = 2000;
        onePiece.duracaoEmMinutos = 120;

        onePiece.exibeFichaTecnica();
        onePiece.avalia(8);
        onePiece.avalia(9.5);
        onePiece.avalia(10);
        onePiece.avalia(9);
        System.out.println(onePiece.somaDasAvaliacoes);
        System.out.println(onePiece.totalDeAvaliacoes);
        System.out.println(onePiece.mediaDasAvaliacoes());
    }
}
