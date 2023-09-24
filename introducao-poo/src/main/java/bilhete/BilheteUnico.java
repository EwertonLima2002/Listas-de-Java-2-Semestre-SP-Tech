package bilhete;

public class BilheteUnico {
    // atribuitos e igual a caracteristicas de um objeto
    // metodos == caracteristicas

    String nome_titular;
    Double saldo;

    void carregar(Double valor_recarga){

        System.out.println(
                String.format("""
                Saldo antes da recarga %.2f
                """, saldo)
        );

        saldo += valor_recarga;

        System.out.println(
                String.format("""
                Saldo após a recarga %.2f
                """, saldo)
        );
    }
}
