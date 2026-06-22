import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Entrada do usuario para receber as notas
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) { //Loop criado para verificar se as notas recebidas sao validas. Se o usuario digitar -1 o loop se encerra.
            System.out.println("Diga sua avaliacao sobre o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) { // Verifica se o usuário digitou uma nota válida antes de acumular
                mediaAvaliacao += nota; // Soma a nota digitada ao total acumulado das notas.
                totalDeNotas++; // Incrementa em 1 a quantidade de notas lidas (contador).
            }
        }
        // Bloco de codigo para verificar e retirar o erro: MediaDeAvaliacoes NaN.

        if (totalDeNotas == 0) {
            System.out.println("Nao obteve notas o suficiente!");
        } else {
            System.out.println("Media de avaliacoes " + mediaAvaliacao / totalDeNotas);
        }
    }
}