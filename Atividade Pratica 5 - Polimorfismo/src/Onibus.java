public class Onibus extends Transporte {
    private boolean intermunicipal;

    public Onibus(boolean intermunicipal) {
        super("Ônibus");
        this.intermunicipal = intermunicipal;
    }

    @Override
    public double calcularTarifa() {
        double base = 5.0;
        if (intermunicipal) {
            return base * 1.5; //
        }
        return base;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Transporte: Ônibus");
        System.out.println("Tipo: " + (intermunicipal ? "intermunicipal" : "local"));
        System.out.println("Tarifa: R$ " + calcularTarifa());
    }
}