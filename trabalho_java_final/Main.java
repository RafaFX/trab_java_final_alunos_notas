import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
				
		Alunos alunoA = new Alunos("5599", "Lucas Krebs", "86967137026");

		Alunos alunoB = new Alunos("4566", "Marcos Filho", "91737334070");

		Alunos alunoC = new Alunos("6745", "Andreia Lima", "12494116023");
		
		Avaliacoes provaA;

		alunoA.addAvaliacoes(provaA);
		System.out.println("Média do aluno A: "+alunoA.mediaAlunos());
		
		Avaliacoes provaB;

		alunoB.addAvaliacoes(provaB);
		System.out.println("Média do aluno B: "+alunoB.mediaAlunos());

		Avaliacoes provaC;

		alunoC.addAvaliacoes(provaC);
		System.out.println("Média do aluno C: "+alunoC.mediaAlunos());

		
		Materia md = new Materia("POO Java", 70);
		md.getAlunos().addAll(List.of(alunoA, alunoB, alunoC));
		md.mediaMateria();

		Materia fd = new Materia("Engenharia de Requisitos", 50);
	}

}

