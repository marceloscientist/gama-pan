package Private;

public class Carro {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "A velocidade m�x do "+this.getNome()+" � 114km";
	}	
}
