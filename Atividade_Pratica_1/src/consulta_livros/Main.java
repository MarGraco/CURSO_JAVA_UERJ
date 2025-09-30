package consulta_livros;
import cadastro_livros.cadastro;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/** Marcello Graco e Eliabe */

public class Main {
    public Main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); 
        ArrayList <cadastro> itens = new ArrayList<>();
        cadastro p;

        int resp=1;
        while(resp==1) {
            
            /** estanciando o objeto*/
            p = new cadastro(null, resp==1);

            /** Cadastro do título do livro*/
            System.out.println("Informe o título do livro: ");
            String titulo = sc.nextLine();
            p.setTitulo(titulo);

            /** Cadastro do autor do livro*/            
            System.out.println("Informe o autor do livro: ");
            String autor = sc.nextLine();
            p.setAutor(autor);

            /** cadastro do ano*/
            int anoPublicacao = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Informe o ano de publicação do livro: ");
                try {
                    anoPublicacao = sc.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro para o ano de publicação.");
                    sc.next();
                }
            }
            p.setAnoPublicacao(anoPublicacao);
            sc.nextLine();

            /** informa se o livro ta disponivel*/ 
            System.out.println("O livro está disponível? ");
            boolean disponivel = sc.nextBoolean();
            p.setDisponivel(disponivel);
            sc.nextLine(); 

            itens.add(p);
                            
            System.out.println("Deseja cadastrar outro livro? (1-Sim / 2-Não)");
            resp=sc.nextInt();
            sc.nextLine();
        }        
        System.out.println("Informe o título do livro que deseja buscar: ");                 
        String tituloBusca = sc.nextLine();

        cadastro encontrado = null;
        for (cadastro a : itens) {
            if (a.getTitulo().equalsIgnoreCase(tituloBusca)) {
                encontrado = a;
                break;
            }
        }
        if (encontrado != null) {
            System.out.println("Livro encontrado: " + encontrado.toString());
        } else {
            System.out.println("Livro com título \"" + tituloBusca + "\" não encontrado.");
            
        }
        /*Aqui vamos criar um menu interativo com o usuario. Eu coloquei o true pra ele depois retornar false e facilitar nossa vida ao sair do menu */
        boolean sair = true;
        while (sair) {
            System.out.println(tituloBusca);
            System.out.println("Escolha uma opção:");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Contar livros disponíveis");
        
            /*Aqui vamos perguntar ao usuário se ele quer fechar o menu*/
            System.out.println("4. Sair");
            sc.nextLine(); // Consumir a quebra de linha            
            if (resp==4) {
                sair = false;
                System.out.println("Saindo do menu...");
                break;
            }
        }
        sc.close();
    }
}