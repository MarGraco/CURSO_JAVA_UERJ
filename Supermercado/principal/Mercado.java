package principal;
import modelo.Produto;
import java.util.Scanner;
import java.util.Locale; // Importe a classe Locale

public class Mercado {
    
    public static void main(String[] args) {
        // Inicializa o Scanner e configura o Locale para aceitar vírgula como separador decimal.
        // É crucial chamar 'sc.close()' no final para liberar os recursos.
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); 
        
        Produto produtos [] = new Produto[3];
        for(int i=0; i<produtos.length;i++) {
            produtos[i] = new Produto();
            System.out.println("Informe o código: ");
            produtos[i].setCodigo(sc.nextInt());
            sc.nextLine(); // Consome a quebra de linha deixada por nextInt()

            System.out.println("Informe o nome do produto: ");
            produtos[i].setNome(sc.nextLine());

            System.out.println("Informe o preço: ");
            produtos[i].setPreco(sc.nextFloat());
            sc.nextLine(); // Consome a quebra de linha deixada por nextFloat()

            System.out.println("Informe o estoque: ");
            produtos[i].setEstoque(sc.nextFloat());
            sc.nextLine(); // Consome a quebra de linha deixada por nextFloat()

            System.out.println("Informe a unidade de medida: ");
            produtos[i].setUnidMedida(sc.nextLine());
        }

        for(int i=0;i<produtos.length;i++) {
            System.out.println(produtos[i]);
        }
        
        sc.close(); // IMPORTANTE: Fechar o Scanner manualmente
    }
}