public class TesteMetodos {
    public static void main(String[] args) {
        String nome01 = "Ewerton";
        String nome02 = "William";

        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();

        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);
        System.out.println("Usando a calculadora:");
        Double resultadoSoma = calc.somar(40.0 , 28.5);

        System.out.println(resultadoSoma);
    }
}
