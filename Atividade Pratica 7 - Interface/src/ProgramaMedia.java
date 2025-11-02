/* Criando a classe que vai alimentar a interface */

import javax.swing.JOptionPane;

public class ProgramaMedia {
    public static void main(String[] args) {
        // Obter notas via caixa de diálogo
        String nota1_sem_tratamento = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2_sem_tratamento = JOptionPane.showInputDialog("Digite a segunda nota:");

        double nota1 = Double.parseDouble(nota1_sem_tratamento);
        double nota2 = Double.parseDouble(nota2_sem_tratamento);

        // Usar interface para calcular a média
        Calculavel calc = new CalculadoraMedia();
        double media = calc.calcularMedia(nota1, nota2);

        String resultado;
        if (media >= 7.0) {
            resultado = "APROVADO";
        } else {
            resultado = "REPROVADO";
        }

        JOptionPane.showMessageDialog(null,
            String.format("Média: %.2f\nResultado: %s", media, resultado));
    }
}