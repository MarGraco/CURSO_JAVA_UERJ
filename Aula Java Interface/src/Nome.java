import javax.swing.JOptionPane;

public class Nome {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual seu nome?", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá, " + nome + " Boas vindas!", "Saudação", JOptionPane.PLAIN_MESSAGE);
    }
}