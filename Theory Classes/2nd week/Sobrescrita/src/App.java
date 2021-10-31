
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atleta atleta1 = new Atleta();
		atleta1.setValorPatrocinio(1000);
		Corredor corredor1 = new Corredor();
		corredor1.setValorPatrocinio(2000);
		
		int taxa = 15;
		atleta1.atualizarValor(taxa);
		corredor1.atualizarValor(taxa);
		
		System.out.println("Valor atualizado do patrocionio do atleta: "+ atleta1.getValorPatrocinio());	
		System.out.println("Valor atualizado do patrocionio do corredor: " + corredor1.getValorPatrocinio());
				
	}

}
