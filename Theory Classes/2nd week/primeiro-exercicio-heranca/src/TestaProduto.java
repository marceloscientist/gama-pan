import javax.swing.JOptionPane;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book livro = new Book();

		livro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Escreva o codigo: ")));
		livro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual � o pre�o?")));
		livro.setDescricao(JOptionPane.showInputDialog("Escreva a descri��o "));
		
		livro.showData();
	}

}
