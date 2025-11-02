public class Metro extends Transporte {
    private int estacoesPercorridas;

    public Metro(int estacoesPercorridas) {
        super("Metrô");
        this.estacoesPercorridas = estacoesPercorridas;
    }

    @Override
    public double calcularTarifa() {
        return 4.3;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Transporte: Metrô");
        System.out.println("Estações percorridas: " + estacoesPercorridas);
        System.out.println("Tarifa: R$ " + calcularTarifa());
    }
}