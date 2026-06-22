package exercitando;

import java.util.Scanner;

public class PositivoeNegativo {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o numero desejado: ");
        int numeroDesejado = numero.nextInt();

        if (numeroDesejado > 0) {
            System.out.println("Numero Positivo!");
        } else {
            System.out.println("Numero Negativo!");
        }
    }
}
