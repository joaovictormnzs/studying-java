public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2013;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10.0;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2000){
            System.out.println("O filme é recente!");
        }else{
            System.out.println("O filme é retro!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado!");
        }else{
            System.out.println("Deve pagar a locaçao");
        }
    }
}
