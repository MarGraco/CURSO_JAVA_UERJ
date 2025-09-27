package principal;
import modelo.Aluno;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

/** código usando array lista @MarGraco */

public class Cadastro_Aluno {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Inicializa o Scanner e configura o Locale para aceitar vírgula como separador decimal.

        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); 
        ArrayList <Aluno> itens = new ArrayList<>();
        Aluno p;

        int resp=1;
        while(resp==1) {
            
            p = new Aluno(null, resp, resp);

            // Cadastro do nome do aluno
            System.out.println("Informe o nome: ");
            String nome = sc.nextLine();
            p.setNome(nome);

            // Cadastro da idade do aluno            
            System.out.println("Informe a idade do aluno: ");
            float idade = sc.nextFloat();
            p.setIdade(idade);
            sc.nextLine();

            // Cadastro da matrícula do aluno
            System.out.println("Informe a matrícula: ");
            int matricula = sc.nextInt();
            p.setMatricula(matricula);
            sc.nextLine(); // Consome a quebra de linha deixada por nextInt()

            itens.add(p);
                            
            System.out.println("Deseja cadastrar outro Aluno? (1-Sim / 2-Não)");
            resp=sc.nextInt();
        }        
        //*/ Aqui iremos procurar uma matrícula para retornar o nome
        System.out.println("Informe a matrícula do aluno que deseja buscar: ");                 
        int matriculaBusca = sc.nextInt();

        Aluno encontrado = null;
        for (Aluno a : itens) {
            if (a.getMatricula() == matriculaBusca) {
                encontrado = a;
                break;
            }
        }
        if (encontrado != null) {
            System.out.println("Aluno encontrado: " + encontrado.toString());
        } else {
            System.out.println("Aluno com matrícula " + matriculaBusca + " não encontrado.");
        }

        sc.close();
}

}
