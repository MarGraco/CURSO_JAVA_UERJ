package consulta_livros;
import cadastro_livros.cadastro;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); 
        ArrayList <cadastro> itens = new ArrayList<>();
        cadastro p;

        int resp=1;
        while(resp==1) {
            
            // estanciando o objeto
            p = new cadastro(null, resp==1);

            // Cadastro do título do livro
            System.out.println("Informe o título do livro: ");
            String titulo = sc.nextLine();
            p.setTitulo(titulo);

            // Cadastro do autor do livro            
            System.out.println("Informe o autor do livro: ");
            String autor = sc.nextLine();
            p.setAutor(autor);

            // Cadastro do ano de publicação do livro se não iremos puxar o construtor simplificado
            int anoPublicacao = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Informe o ano de publicação do livro: ");
                try {
                    anoPublicacao = sc.nextInt();
                    validInput = true; // Entrada válida, sai do loop
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro para o ano de publicação.");
                    sc.next(); // Limpa a entrada inválida
                }
            }
            p.setAnoPublicacao(anoPublicacao);
            sc.nextLine();

            System.out.println("O livro está disponível? (true/false): ");
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
        sc.close();
    }
}