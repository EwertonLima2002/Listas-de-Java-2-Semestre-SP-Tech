package livraria;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class TesteLivraria {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();



        Scanner leitor = new Scanner(System.in);
        Integer opcao = 0;
        System.out.println("""
                +-----------------------------------+
                1)Cadastrar  Livro
                2) Exibir Livros
                3-) Atualizar Livro
                4-) Remover Livro
                5-) Buscar Pelo Nome
                6) Sair
                """);
        opcao = leitor.nextInt();

        con.execute("""
    CREATE TABLE IF NOT EXISTS livro (
        idlivro int primary key auto_increment,
        nome_livro varchar(50),
        valor_livro decimal(10, 2)
      )""");


        leitor.nextLine();
        switch (opcao){
            case 1: {
                System.out.println("Digite o Nome do Filme");
                String nome = leitor.nextLine();


                System.out.println("Digite o valor do livro");
                Double valor = leitor.nextDouble();
                Livros livro = new Livros(nome , valor);



                con.update("INSERT INTO livro (nome_livro, valor_livro) VALUES ( ? , ?)" ,livro.getNome_livro(), livro.getValor_livro());

                System.out.println("Lista de Livros");
                List<Livros> filmesDoBanco = con.query("SELECT * FROM livro",
                        new BeanPropertyRowMapper<>(Livros.class));

                for(Livros l : filmesDoBanco){
                    System.out.println(l);
                }

                break;




            }

            case 2:{
                List<Livros> filmesDoBanco = con.query("SELECT * FROM livro",
                        new BeanPropertyRowMapper<>(Livros.class));

                for(Livros l : filmesDoBanco){
                    System.out.println(l);
                }
                break;
            }


            case 3:{
                System.out.println("Me informe o id do livro que você quer atualizar:");
                Integer id = leitor.nextInt();

                leitor.nextLine();

                System.out.println(id);
                System.out.println("Me informe o novo nome do livro");
                String novo_nome = leitor.nextLine();
                System.out.println(novo_nome);

                System.out.println("Agora pra finalizar me diz o preço:");
                Double preco = leitor.nextDouble();

                System.out.println(preco);


                con.update("update livro set nome_livro = ?, valor_livro = ? where idlivro = ?;", id, novo_nome, preco);

                System.out.println("Lista Atualizada");
                List<Livros> filmesDoBanco = con.query("SELECT * FROM livro",
                        new BeanPropertyRowMapper<>(Livros.class));

                for(Livros l : filmesDoBanco){
                    System.out.println(l);
                }

            }
            case 4:{
                System.out.println("Me informe o id do livro que você quer deletar:");
                Integer id = leitor.nextInt();

                con.update("DELETE FROM livro WHERE idlivro = ?", id);


                System.out.println("Lista Atualizada");
                List<Livros> filmesDoBanco = con.query("SELECT * FROM livro",
                        new BeanPropertyRowMapper<>(Livros.class));

                for(Livros l : filmesDoBanco){
                    System.out.println(l);
                }

            }
            case 5:{
                System.out.println("Me diz o nome do livro que você quer visualizar:");
                String nome_livro = leitor.nextLine();

                String select_com_busca = "%" + nome_livro + "%";

              List<Livros>livrosDoBanco = con.query("SELECT * FROM livro WHERE nome_livro LIKE ?",
                        new BeanPropertyRowMapper<>(Livros.class), select_com_busca);

              if(livrosDoBanco.isEmpty()){
                  System.out.println("Não existe esse livro no nosso banco de dados");
              }
              else {
                  System.out.println(livrosDoBanco);

              }
                break;
            }
            case 6:{
                System.out.println("Saindo");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            }
        }




    }

