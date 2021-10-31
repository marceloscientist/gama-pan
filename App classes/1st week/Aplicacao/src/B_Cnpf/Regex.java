package B_Cnpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static String adicionarMascaraCNPJ(String cnpj) {
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})");
		Matcher matcher = pattern.matcher(cnpj);
		if(cnpj.length() != 14) {
			System.out.println("Não tem 14 digitos");
			return cnpj;
		} else {
			return matcher.replaceAll("$1.$2.$3/$4-$5");
		}
		
	}
	
	public static String adicionarMascaraCPF(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
		Matcher matcher = pattern.matcher(cpf);
		if(cpf.length() != 11) {
			System.out.println("Não tem 11 digitos");
			return cpf;
		} else {
			return matcher.replaceAll("$1.$2.$3-$4");
		}
		
	}
}
