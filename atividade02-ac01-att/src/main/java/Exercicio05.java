public class Exercicio05 {
    String calcular_imc(Double altura, Double peso) {

        Double imc_total = peso / (altura * altura);
        String mensagem = """
            O seu IMC é de %.2f 
            """.formatted(imc_total);

        return mensagem;
    }
    }

