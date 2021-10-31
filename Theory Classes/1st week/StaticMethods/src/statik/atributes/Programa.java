package statik.atributes;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time.professor = "Master Coach";
		Time atleta1 = new Time();
		atleta1.atleta = "Julia";
		Time.professor = "Maria";
		Time atleta2 = new Time();
		atleta2.atleta = "Marcus";
		System.out.println(Time.professor);
		System.out.println(atleta1.atleta);
		System.out.println(atleta2.atleta);
		
		

	}

}
