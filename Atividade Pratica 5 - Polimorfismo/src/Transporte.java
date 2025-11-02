public class Transporte {
    protected String tipo;

    public Transporte(String tipo) {
        this.tipo = tipo;
    }

    public double calcularTarifa() {
        return 5.0;
    }

    public void exibirDetalhes() {
        System.out.println("Transporte: " + tipo);
        System.out.println("Tarifa: R$ " + calcularTarifa());
    }
}