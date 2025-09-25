package src.modelo;

public class Cliente {
	private String nome;
	
	public Cliente() {
		
	}
	public Cliente(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return ("\nNome: "+nome);
	}
}