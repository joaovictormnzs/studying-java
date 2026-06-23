public class main {
    public static void main(String[] args) {
        Calculadora numero1 = new Calculadora();
        numero1.numero = 10;
        System.out.println(numero1.dobroNumero());

        Calculadora num2 = new Calculadora();
        num2.numero = 100;
        System.out.println(num2.dobroNumero());
    }
}
