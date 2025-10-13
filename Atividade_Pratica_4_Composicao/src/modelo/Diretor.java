package modelo;

public class Diretor {
    public String nome;
    public int tempo_experiencia;
    public String local_de_origem;

    public Diretor(String nome, int tempo_experiencia, String local_de_origem) {
        this.nome = nome;
        this.tempo_experiencia = tempo_experiencia;
        this.local_de_origem = local_de_origem;
    }
    public String getNome() {
        return nome;
    }
    public int getTempo_experiencia() {
        return tempo_experiencia;
    }
    public String getLocal_de_origem() {
        return local_de_origem;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTempo_experiencia(int tempo_experiencia) {
        this.tempo_experiencia = tempo_experiencia;
    }
    public void setLocal_de_origem(String local_de_origem) {
        this.local_de_origem = local_de_origem;
    }
    /* Aqui vamos fazer os métodos de impressão */
    public String toString() {
        return "Diretor: " + nome + ", Tempo de Experiência: " + tempo_experiencia + " anos, Local de Origem: " + local_de_origem;
    }
}

