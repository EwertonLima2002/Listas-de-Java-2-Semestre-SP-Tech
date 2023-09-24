public class TesteTermometro {
    public static void main(String[] args) {

        Termometro termometro = new Termometro(25.0, 30.0, 10.0);


        termometro.aumentaTemperatura(5.0);


        termometro.diminuiTemperatura(8.0);


        termometro.exibeFahrenheit();


        System.out.println("Temperatura Atual: " + termometro.TemperaturaAtual() + " °C");
        System.out.println("Temperatura Máxima: " + termometro.TemperaturaMax() + " °C");
        System.out.println("Temperatura Mínima: " + termometro.TemperaturaMin() + " °C");
    }
}