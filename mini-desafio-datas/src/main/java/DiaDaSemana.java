import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DateTimeFormatter formato_para_captura = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data_atual = LocalDate.now();
        String dia = "";

        System.out.println("Digite uma data");
        LocalDate data = LocalDate.parse(leitor.nextLine(), formato_para_captura);
        String dia_formatado = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        DayOfWeek dia_da_semana = data.getDayOfWeek();

        switch (dia_da_semana){
            case MONDAY -> {
                dia = "Segunda";
            }
            case TUESDAY -> {
                dia = "Terça";
            }
            case WEDNESDAY -> {
                dia = "Quarta";
            }
            case THURSDAY -> {
                dia = "Quinta";
            }
            case FRIDAY -> {
                dia = "Sexta";
            }
            case SATURDAY -> {
                dia = "Sábado";
            }
            case SUNDAY -> {
                dia = "Domingo";
            }
            default -> {
                dia = " dia inválido";
            }
        }

        if(data_atual.isAfter(data)){
            System.out.println("""
                    o dia %s é antes e é %s
                    """.formatted(dia_formatado , dia));
        }
        else if(data_atual.isBefore(data)){
            System.out.println("""
                    o dia %s é depois e é %s
                    """.formatted(dia_formatado , dia));
        }
        else{
            System.out.println("""
                    o dia %s é hoje e é %s
                    """.formatted(dia_formatado , dia));
        }
    }
}