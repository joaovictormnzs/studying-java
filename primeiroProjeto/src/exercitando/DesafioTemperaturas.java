package exercitando;

public class DesafioTemperaturas {

    public static void main(String[] args){
        double temperaturaCelsius = 30.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println(String.format("A temperatura %.2f em Celsius é equivalente a %.2f em Fahrenheit", temperaturaCelsius, temperaturaFahrenheit));

        int temperaturaEmFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}
