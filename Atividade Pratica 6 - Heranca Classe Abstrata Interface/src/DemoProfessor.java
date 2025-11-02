import java.util.Scanner;

public class DemoProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de professores para o semestre: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        Professor[] professores = new Professor[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nProfessor #" + (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();

            System.out.print("Data de nascimento (dd mm aaaa): ");
            int dia = sc.nextInt(), mes = sc.nextInt(), ano = sc.nextInt();
            sc.nextLine();

            Data data_nascimento = new Data(dia, mes, ano);

            System.out.print("Tipo (1-Integral, 2-Horista): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            if (tipo == 1) {
                System.out.print("Salário fixo: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                professores[i] = new ProfessorIntegral(nome, matricula, data_nascimento, salario);
            } else {
                System.out.print("Valor da hora/aula: ");
                double valorHora = sc.nextDouble();
                System.out.print("Carga horária semanal: ");
                int carga = sc.nextInt();
                sc.nextLine();
                professores[i] = new ProfessorHorista(nome, matricula, data_nascimento, valorHora, carga);
            }
        }

        System.out.println("\n--- Dados dos Professores ---");
        for (Professor p : professores) {
            System.out.println(p.exibirDados());
            System.out.println("-----------------------------");
        }

        sc.close();
    }
}