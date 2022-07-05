public class Prova extends Avaliacoes {
	
	private Integer quantidadeQuestoes;


	public Prova(Integer peso, Double nota, Integer quantidadeQuestoes) {
		super(peso, nota);
		this.quantidadeQuestoes = quantidadeQuestoes;
	}

	public Integer getquantidadeQuestoes() {
		return quantidadeQuestoes;
	}

	public void setquantidadeQuestoes(Integer quantidadeQuestoes) {
		this.quantidadeQuestoes = quantidadeQuestoes;
	}	
	
}
