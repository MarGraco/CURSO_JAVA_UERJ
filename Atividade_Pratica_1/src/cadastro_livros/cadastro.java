package cadastro_livros;

public class cadastro {
    private String titulo;
    private String autor;    
    private int anoPublicacao;
    private boolean disponivel;

    public cadastro() {
        
    }
    // construtores completo
    public cadastro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }
    // construtor simplificado
    public cadastro(String titulo, boolean disponivel) {
        this.titulo = titulo;
        // this.autor = autor;
        // this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }
    public String getTitulo () {
        return this.titulo;
    }
    public String getAutor () {
        return this.autor;
    }
    public int getAnoPublicacao () {
        return this.anoPublicacao;
    }
    public boolean getDisponivel () {
        return this.disponivel;
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    public void setAutor (String autor) {
        this.autor = autor;
    }
    public void setAnoPublicacao (int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public void setDisponivel (boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String toString() {
        return "Título: " + this.titulo + ", Autor: " + this.autor + ", Ano de Publicação: " + this.anoPublicacao + ", Disponível: " + (this.disponivel ? "Sim" : "Não");
    }
    public boolean emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            return true; // Empréstimo bem-sucedido
        } else {
            return false; // Livro não disponível para empréstimo
        }
    }
    public void devolver() {
        this.disponivel = true; // Marca o livro como disponível
    }
    public void contarDisponiveis(cadastro[] livros) {
        int count = 0;
        for (cadastro livro : livros) {
            if (livro.getDisponivel()) {
                count++;
            }
        }
        System.out.println("Total de livros disponíveis: " + count);
    }
}