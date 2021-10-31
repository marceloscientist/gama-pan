import java.text.DecimalFormat;

public class Formata {

	public static void main(String[] args) {
		double valor = 300000.0;
		double parcelas = 3.0;
		double prestacao = valor/parcelas;
		
		DecimalFormat df = new DecimalFormat("R$ ###,000.00");
		System.out.println(df.format(prestacao));
	}
}
