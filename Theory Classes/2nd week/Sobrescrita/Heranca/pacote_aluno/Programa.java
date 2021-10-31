package pacote_aluno;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno();
		Professor professor1 = new Professor();
		
		aluno1.setNome("Julio");
		aluno1.setCurso("Portugues");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getCurso());	
		professor1.setSalario(1000.00);
	}

}
