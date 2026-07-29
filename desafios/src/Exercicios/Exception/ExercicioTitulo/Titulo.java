package Exercicios.Exception.ExercicioTitulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Titulo {
    String nome;
    String tipo;

    public Titulo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Digite o nome do filme (ou digite sair para finalizar o programa): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o tipo (filme/serie/anime): ");
            String tipo = scanner.nextLine();

            Titulo titulo = new Titulo(nome, tipo);
            titulos.add(titulo);
        }

        String json = gson.toJson(titulos);

        System.out.println("---LISTA EM JSON----");
        System.out.println(json);


        scanner.close();
    }
}