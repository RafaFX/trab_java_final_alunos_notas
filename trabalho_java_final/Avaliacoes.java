
public class Avaliacoes {
	
	private Integer peso;
	private Double nota;
	private Alunos alunos;
	

	public Avaliacoes(Integer peso2, Double nota2) {
	}

	public void Avaliacao(Integer peso, Double nota) {

		this.peso = peso;

		this.nota = nota;
		
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Alunos getAlunos() {
		return alunos;
	}

	public void setAlunos(Alunos alunos) {
		this.alunos = alunos;
	}
	
	public Double calculaNota() {
		return peso * nota;
	}
}
