package exercitando;

public class Conversao {
    public static void main(String[] args){
        double valorEmDolares = 100.0;
        double taxaDeConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaDeConversao;
        System.out.println(String.format("%.2f em dolares equivale a %.2f em reais", valorEmDolares, valorEmReais));
    }
}
