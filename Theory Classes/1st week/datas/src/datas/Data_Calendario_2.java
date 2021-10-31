package datas;
																	import java.util.Calendar;
import javax.swing.JOptionPane;

public class Data_Calendario_2 {
    public static void main(String[] args) {
	Calendar calendario1 = Calendar.getInstance();
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
	int ano_atual = calendario1.get(Calendar.YEAR);
	int idade = ano_atual - ano;
	
	System.out.println(idade);
	}
}