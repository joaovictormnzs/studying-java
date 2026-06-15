package exercitando;

public class Desconto {

    public static void main(String[] args){
        double precoOriginal = 150.0;
        double percentualDesconto = 15.0;
        double valorDesconto = (percentualDesconto/100) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("O valor do produto com desconto fica de R$ " +novoPreco);
    }
}
