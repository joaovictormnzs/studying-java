package desafio;

import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
        String nome = "Joao Victor";
        String tipoConta = "Corrente";
        double saldo = 1000.00;


        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: "+ tipoConta);
        System.out.println("Saldo: "+ saldo);
        System.out.println("\n**********************************");

        int opcao = 0;

        String menu = """
                \n**Digite sua opcao:**
                
                1. Consultar Saldo.
                2. Tranferir valor.
                3. Receber Valor.
                4. Sair.
               
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){ //Consulta de saldo
                System.out.println("Seu saldo atual é de: R$ " + saldo);

            } else if (opcao == 2 ) { // Transferencia de saldo
                System.out.println("Digite o valor que deseja transferir: ");
                double valorTransferir = leitura.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Voce nao possui saldo o suficiente!");
                } else {
                    saldo = saldo - valorTransferir;
                    System.out.println("Novo saldo:" + saldo);
                }

            } else if (opcao == 3 ) { // Recebimento de valores
                System.out.println("Digite o valor que irá receber: ");
                double valorReceber = leitura.nextDouble();

                saldo = saldo + valorReceber;
                System.out.println("O seu saldo atual é de R$ " + saldo);

            } else if (opcao != 4) {
                System.out.println("Opcao Invalida!");
            }
        }
    }
}
