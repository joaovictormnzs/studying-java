package exercitando;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os numeros sao iguais!");
        } else if (numero1 != numero2 && numero1 > numero2) {
            System.out.println("Os numeros sao diferentes e o primeiro numero é maior que o segundo!");
        } else if (numero1 != numero2 && numero1 < numero2){
            System.out.println("Os numeros sao diferentes e o primeiro numero é menor que o segundo!");
        }
    }
}
