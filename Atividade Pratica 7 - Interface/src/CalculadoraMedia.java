/* Apenas definiando a Calculadora Media pra Interface */

public class CalculadoraMedia implements Calculavel {
    @Override
    public double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }
}