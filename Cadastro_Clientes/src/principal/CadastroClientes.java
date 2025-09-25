package principal;
import java.util.Scanner;
import java.util.Locale; // Importe a classe Locale
import modelo.Cliente;

public class CadastroClientes {
    
    public static void main(String[] args) {
        // Inicializa o Scanner e configura o Locale para aceitar vírgula como separador decimal.
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); 
        
        Cliente clientes [] = new Cliente[3];
        for(int i=0; i<clientes.length;i++) {
            clientes[i] = new Cliente();

            System.out.println("Informe o nome do cliente: ");
            clientes[i].setNome(sc.nextLine());
        }

        // for(int i=0;i<clientes.length;i++) {
        //     System.out.println(clientes[i]);
        System.out.println("Pesquise por um cliente: ");
        String pesquisa = sc.nextLine();

        Cliente clienteEncontrado = null;

        for(int i=0;i<clientes.length;i++) {
            if(clientes[i].getNome().equalsIgnoreCase(pesquisa)) {
                clienteEncontrado = clientes[i];
                break; 
            }
        }
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado);
        } else {
            System.out.println("Cliente não encontrado.");
        }

        sc.close(); // professora, eu tive que colocar essa linha pois o github actions não estava aceitando o scanner sem ele.
    }
}