/* Abaixo vamos criar a subclass Professor Integral que vai herdar os métodos de Professor */


public class ProfessorIntegral extends Professor implements ISalario {
    private double salario;

    public ProfessorIntegral(String nome, String matricula, Data data_nascimento, double salario) {
        super(nome, matricula, data_nascimento);
        this.salario = salario;
    }

    public double getSalario() { 
        return salario; 
    }
    public void setSalario(double salario) { 
        this.salario = salario; 
    }

    @Override
    public String exibirDados() {
        return "Professor Integral:\n" +
               "Nome: " + getNome() + "\n" +
               "Matrícula: " + getMatricula() + "\n" +
               "Data de Nascimento: " + getNascimento() + "\n" +
               "Salário: R$ " + salario;
    }
}