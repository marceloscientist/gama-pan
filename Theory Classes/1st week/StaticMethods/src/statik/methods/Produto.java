package statik.methods;

public class Produto {
	public static int resultado(int arroz, int feijao) {
		return (arroz + feijao);
	}
	public static String mudeNomeProduto(String nomeProd) {
		return (nomeProd);
	}
	public static String pegarCpf(String cpf) {
		String tratei = cpf.strip();
		return tratei;
	}
}
