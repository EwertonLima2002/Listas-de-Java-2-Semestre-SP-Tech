public class Termometro {
    double temperaturaAtual;
    double temperaturaMax;
    double temperaturaMin;


    public Termometro(double temperaturaAtual, double temperaturaMax, double temperaturaMin) {
        this. temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }


    public void aumentaTemperatura(double valor) {
        temperaturaAtual += valor;
        if (temperaturaAtual > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        }
    }


    public void diminuiTemperatura(double valor) {
        temperaturaAtual -= valor;
        if (temperaturaAtual < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        }
    }

    public void exibeFahrenheit() {
        double temperaturaFahrenheit = (temperaturaAtual * 9 / 5) + 32;
        System.out.println("Temperatura atual em Fahrenheit: " + temperaturaFahrenheit + " °F");
    }

    public double TemperaturaAtual() {
        return temperaturaAtual;
    }

    public double TemperaturaMax() {
        return temperaturaMax;
    }

    public double TemperaturaMin() {
        return temperaturaMin;
    }
}
