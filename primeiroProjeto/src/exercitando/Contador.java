package exercitando;

// DIIFERENTES FORMAS DE CONTAR DE 1 A 10.

public class Contador {
    public static void main(String[] args) {

        for (int contador = 1; contador < 10; contador++) {
            System.out.println(contador);
        }

        int contador = 0;
        while (contador <= 10 ){
            System.out.println(contador);
            contador++;
        }
    }
}
