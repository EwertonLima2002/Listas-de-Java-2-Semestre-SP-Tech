package livraria;

public class TesteLivro {
    public static void main(String[] args) {

        Livro livro01 = new Livro(1 , "As aventuras de Poliana" , "Silvia Abravenel" ,25.50 ,
            2, 20 );

        System.out.println(livro01);
        // linha de teste coloquei 2 livros no 3 ele tem que barrar teste passou;
        livro01.venderLivro();

        livro01.venderLivro();

        livro01.venderLivro();
        //sucess

        // passando com parametro funcionando
        // ele tem que retornar 19
        System.out.println(livro01.venderLivro(16));
        // teste passou com sucesso

        // valor deu certo // teste passou com sucesso
        System.out.println(livro01.calcularTotalVendas());
        // sucess

        // teste de aumentar estoque
        System.out.println(livro01.aumentarEstoque(20));
        // teste passou

        // todos teste passaram 100 % funcionando :)

    }
}


