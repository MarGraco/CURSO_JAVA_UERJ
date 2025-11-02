public class BicicletaCompartilhada extends Transporte {
    private double horasUso;

    public BicicletaCompartilhada(double horasUso) {
        super("Bicicleta Compartilhada");
        this.horasUso = horasUso;
    }

    @Override
    public double calcularTarifa() {
        return horasUso * 1.5;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Transporte: Bicicleta Compartilhada");
        System.out.println("Horas de uso: " + horasUso);
        System.out.println("Tarifa: R$ " + calcularTarifa());
    }
}