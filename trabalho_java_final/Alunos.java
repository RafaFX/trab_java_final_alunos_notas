import java.util.ArrayList;
import java.util.List;

public class Alunos {
	

	private String nome;

	private String CPF;
	
	private String matricula;

	private List<Avaliacoes> avaliacoes = new ArrayList<>();

	public void getAlunos(){}

	public Alunos(String NumMatricula, String nome, String CPF) {

		this.nome = nome;

		this.CPF = CPF;

		this.matricula = NumMatricula;

	}
	
	public void addAvaliacoes(Avaliacoes avaliacoes) {

		this.avaliacoes.add(avaliacoes);

		avaliacoes.setAlunos(this);

	}
	
	public String getNumMatricula() {
		return matricula;
	}

	public void setNumMatricula(String NumMatricula) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public List<Avaliacoes> getAvaliacoes() {
		return avaliacoes;
	}
	
	public Double mediaAlunos() {
		double sum = 0;
		int peso = 0;
		for (Avaliacoes avaliacao : getAvaliacoes()) {
			sum += avaliacao.calculaNota();
			peso += avaliacao.getPeso();
		}
		return sum/peso;
	}
}
