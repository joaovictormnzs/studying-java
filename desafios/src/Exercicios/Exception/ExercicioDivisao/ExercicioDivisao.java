package Exercicios.Exception.ExercicioDivisao;

import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        int numerador = scanner.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = scanner.nextInt();

        try {
            int resultado = numerador/denominador;
            System.out.println("O resultado da divisao é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é permitida divisao por zero.");
        }
    }
}
