/* Já o Professor Horista, além dos dados básicos, armazena o valor da hora/aula, 
a carga horária semanal e possui um método getSalario() que retorna o cálculo do salário. */

public class ProfessorHorista extends Professor implements ISalario {
    private double valorHoraAula;
    private int cargaHorariaSemanal;

    public ProfessorHorista(String nome, String matricula, Data data_nascimento, double valorHoraAula, int cargaHorariaSemanal) {
        super(nome, matricula, data_nascimento);
        this.valorHoraAula = valorHoraAula;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public double getValorHoraAula() { 
        return valorHoraAula; 
    }
    public void setValorHoraAula(double valorHoraAula) { 
        this.valorHoraAula = valorHoraAula; 
    }

    public int getCargaHorariaSemanal() { 
        return cargaHorariaSemanal; 
    }
    public void setCargaHorariaSemanal(int cargaHorariaSemanal) { 
        this.cargaHorariaSemanal = cargaHorariaSemanal; 
    }

    @Override
    public double getSalario() {
        // Supondo 4 semanas por mês
        return valorHoraAula * cargaHorariaSemanal * 4;
    }

    @Override
    public String exibirDados() {
        return "Professor Horista:\n" +
               "Nome: " + getNome() + "\n" +
               "Matrícula: " + getMatricula() + "\n" +
               "Data de Nascimento: " + getNascimento() + "\n" +
               "Valor da hora/aula: R$ " + valorHoraAula + "\n" +
               "Carga horária semanal: " + cargaHorariaSemanal + "h\n" +
               "Salário: R$ " + getSalario();
    }
}