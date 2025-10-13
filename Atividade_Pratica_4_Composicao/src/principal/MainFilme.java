package principal;

import modelo.Diretor;
import modelo.Filme;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFilme {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Cadastro dos filmes
        while (true) {
            System.out.println("Digite o título do filme que deseja cadastrar:");
            String titulo = sc.nextLine();
            
            /* Aqui vamos puxar o metodo de comparação de titulos que fizemos em Filme */
            if (true) {
                boolean tituloExistente = false;
                for (Filme filmeExistente : filmes) {
                    if (filmeExistente.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println("Já existe um filme cadastrado com esse título. Por favor, insira um título diferente.");
                        tituloExistente = true;
                        break;
                    }
                }
                if (tituloExistente) {
                    continue;
                }
            }

            }

            /* Se o nosso metodo anterior nao funcionou, significa que temos um filme a cadastrar mesmo... */

            System.out.println("Digite a descrição do filme:");
            String descricao = sc.nextLine();

            System.out.println("Digite a duração do filme em minutos:");
            int duracao = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome do diretor do filme:");
            String nomeDiretor = sc.nextLine();

            System.out.println("Digite o tempo de experiência do diretor em anos:");
            int tempoExperiencia = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o local de origem do diretor:");
            String localDeOrigem = sc.nextLine();

            System.out.println("Deseja cadastrar outro filme? (s/n)");
            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }

        // Busca por título
        System.out.println("\nDigite o título do filme que deseja buscar:");
        String buscaTitulo = sc.nextLine();
        boolean encontrado = false;
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(buscaTitulo)) {
                System.out.println("Filme encontrado:"+filme.getTitulo()+"Com duração de"+filme.getDuracao_em_minutos()+"minutos");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Filme não encontrado.");
        }
        /* Agora vamos listar todos os filmes cadastrados */
        System.out.println("\nLista de todos os filmes cadastrados:");
        for (Filme filmes : filmes) {
            System.out.println(filmes);
            filmes.exibirDuracaoEmHoras(); // Exibindo a duração em horas
        }

        sc.close();
    }   

}
