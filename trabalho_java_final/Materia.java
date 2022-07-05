import java.util.ArrayList;
import java.util.List;

public class Materia {
	
	private List<Alunos> alunos = new ArrayList<>();

	private int id;

	private String nome;
	

	public Materia(String i, int id) {

		this.nome = i;

		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Alunos> getAlunos() {
		return alunos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void mediaMateria() {

		int cont = 0;

		double sum = 0;

		for (Alunos alunos : getAlunos()) {
			sum += alunos.mediaAlunos();
			cont++;
		}
		System.out.println("Essas são as medias dos alunos na Materia: " + sum/cont);
	}
}
