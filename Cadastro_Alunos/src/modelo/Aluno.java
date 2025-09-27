package modelo;

public class Aluno {
	private int matricula;
	private String nome;
	private float idade;
	
	public Aluno(String nome, float idade, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
	//*/ nome como String
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//*/ idade como float
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}

	//*/ matricula como int
		public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String toString() {
		return ("\nNome: "+nome+"\nMatricula: "+matricula+"\nIdade: "+idade+"\n");
	}
	
}