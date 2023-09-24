package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime data_hora = LocalDateTime.now();

        System.out.println(data);
        System.out.println(hora);
        System.out.println(data_hora);

        DateTimeFormatter formatador_de_data = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        DateTimeFormatter formato_data_hora = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm:ss");

//
//
//        System.out.println(data_hora.format(formatador_de_data));
//        System.out.println(data_hora.format(formatador_de_data));

        // capturando datas

        Scanner leitor = new Scanner(System.in);
        DateTimeFormatter formato_para_captura = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite sua data de nascimento");
       LocalDate data_aniversario = LocalDate.parse(leitor.nextLine(), formato_para_captura);

        System.out.println(data_aniversario.format(formato_para_captura));

        // metodos uteis

        if(data_aniversario.isAfter(data)){
            System.out.println("Você ainda nem existe");
        }
        if(data_aniversario.isBefore(data)){
            System.out.println("Você já existe");
        }
        if(data_aniversario.isEqual(data)){
            System.out.println("Datas Iguais");
        }
        System.out.println(data.plusDays(1));
        System.out.println(data.plusMonths(1));
        data.plusYears(1);
        System.out.println(data);


        data.minusDays(1);
        data.minusYears(1);
        data.minusMonths(1);
        System.out.println(data);

        System.out.println(data.getMonth());
        System.out.println(data.getMonth());
        System.out.println(data.getDayOfWeek());
    }
}
