package principal;
import modelo.Produto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

/** código usando array lista @MarGraco */

public class Mercado_List {
    
    public static void main(String[] args) {
        // Inicializa o Scanner e configura o Locale para aceitar vírgula como separador decimal.
        // É crucial chamar 'sc.close()' no final para liberar os recursos.
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); 
        ArrayList <Produto> itens = new ArrayList<>();
        Produto p;

        int resp=1;
        while(resp==1) {
            p = new Produto();
            System.out.println("Informe o código: ");
            p.setCodigo(sc.nextInt());
            sc.nextLine(); // Consome a quebra de linha deixada por nextInt()

            System.out.println("Informe o nome do produto: ");
            p.setNome(sc.nextLine());
            sc.nextLine();
            sc.nextLine();

            System.out.println("Informe o preço: ");
            p.setPreco(sc.nextFloat());
            sc.nextLine(); // Consome a quebra de linha deixada por nextFloat()

            System.out.println("Informe o estoque: ");
            p.setEstoque(sc.nextFloat());
            sc.nextLine(); // Consome a quebra de linha deixada por nextFloat()

            System.out.println("Informe a unidade de medida: ");
            p.setUnidMedida(sc.nextLine());
            sc.nextLine();
            sc.nextLine();
            
            itens.add(p);
            
            System.out.println("Deseja cadastrar outro produto? (1-Sim / 2-Não)");
            resp=sc.nextInt();
        }

        for (int i=0;i<itens.size();i++) {
            System.out.println(itens.get(i));
        }
        /** Aqui há uma outra forma de realizar o print*/
        // for (Produto prod:itens) {
        //     System.out.println(prod);
        //
        sc.close();
    }
}
