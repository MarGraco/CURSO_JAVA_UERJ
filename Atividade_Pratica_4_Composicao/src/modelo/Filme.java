package modelo;

public class Filme {
    private String titulo;
    public String descricao_do_filme;
    public Diretor diretor; // Aqui estou aplicando a Composição que puxa a classe diretor do modelo Diretor
    public int duracao_em_minutos;

    /* Aqui fiz a construção do padrao */
    public Filme(String titulo, int duracao_em_minutos) {
        this.titulo = titulo;
        this.duracao_em_minutos = duracao_em_minutos;
    }
    /* Aqui fiz a construção do completo */
    public Filme(String titulo, String descricao_do_filme, Diretor diretor, int duracao_em_minutos) {
        this.titulo = titulo;
        this.descricao_do_filme = descricao_do_filme;
        this.diretor = diretor;
        this.duracao_em_minutos = duracao_em_minutos;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao_do_filme() {
        return descricao_do_filme;
    }
    public Diretor getDiretor() {
        return diretor;
    }
    public int getDuracao_em_minutos() {
        return duracao_em_minutos;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao_do_filme(String descricao_do_filme) {
        this.descricao_do_filme = descricao_do_filme;
    }
    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
    public void setDuracao_em_minutos(int duracao_em_minutos) {
        this.duracao_em_minutos = duracao_em_minutos;
    }
    public String toString() {
        return "Filme: " + titulo + ", Descrição: " + descricao_do_filme + ", Diretor: " + diretor.getNome() + ", Duração: " + duracao_em_minutos + " minutos";
    }
    /* Aqui vamos criar o metodo exibirDuracaoEmHoras */
    void exibirDuracaoEmHoras(){
        int horas = duracao_em_minutos / 60;
        int minutos = duracao_em_minutos % 60;
        System.out.println("Duração em horas: " + horas + " horas e " + minutos + " minutos");
    }
    /* Aqui vamos criar o metodo de comparacao de titulo de filme e retornar o nome do filme*/
    public void compararTitulo(String outroFilme) {
        if (titulo.equalsIgnoreCase(outroFilme)) {
            System.out.println("Os filmes têm o mesmo título.");
        }
    }
}
