import java.util.ArrayList;

public class SistemaTransporte {
    public static void main(String[] args) {
        ArrayList<Transporte> lista = new ArrayList<>();

        lista.add(new Onibus(true)); 
        lista.add(new Metro(5)); 
        lista.add(new BicicletaCompartilhada(2.0)); 
        lista.add(new Onibus(false)); 

        for (Transporte t : lista) {
            t.exibirDetalhes();
            System.out.println("-------------------------------");
        }
    }
}