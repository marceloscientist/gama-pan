import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Atleta {
	private int codigo;
	private String nome; 
	private String esporte;

	
	private double valorPatrocinio;
	
	// encurtei os getters
	public void inserirDados( ) {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite  o cod: "));
		this.nome = JOptionPane.showInputDialog("Digite  o nome: ");
		this.esporte = JOptionPane.showInputDialog("Digite  o esporte: ");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor: "));
		String mensagem = "Objeto atleta criado a partir da classe Atleta";
		mensagem += "\n Codigo " + this.codigo;
		mensagem += "\n Nome " + this.nome;
		mensagem += "\n Esporte " + this.esporte;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\n Valor de patrocinio: " + formatar.format(this.valorPatrocinio);
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public double atualizarValor(double taxa) {
		double taxaAplicada = this.valorPatrocinio * taxa/100;
		this.valorPatrocinio += taxaAplicada;
		return valorPatrocinio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public double getValorPatrocinio() {
		return valorPatrocinio;
	}

	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
	
	
}
