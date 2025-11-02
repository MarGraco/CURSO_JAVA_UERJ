/* Os dados básicos dos professores são: 
nome, matrícula e data de nascimento. Um professor pode ser classificado como 
“Integral” ou como “Horista” */

/* Vou criar primeiro  a classe Professor. Depois o Professor Integral e o Professor horista*/

public abstract class Professor {
    private String nome;
    private String matricula;
    private Data data_nascimento;

    public Professor(String nome, String matricula, Data data_nascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;
    }

    // Getters e setters pra nome, matrícula e data de nascimento.
    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getMatricula() { 
        return matricula; 
    }
    public void setMatricula(String matricula) { 
        this.matricula = matricula; 
    }

    public Data getNascimento() { 
        return data_nascimento; 
    }
    public void setNascimento(Data data_nascimento) { 
        this.data_nascimento = data_nascimento; 
    }

    // Abaixo, o método pra puxar todos os dados. O horista e o integral vão precisar implementar isso.
    public abstract String exibirDados();
}