package for_;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificarForWhile {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.println("Consegui "+ i);
		}
		
		String example = "2021.10.10";
		Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
		Matcher matcher = pattern.matcher(example);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("hello1234goodboy789very2345");
		while(m.find()) {
			System.out.println(m.group());
		}
		
		String text = "John speak and John write about that,\"\r\n" 
				+ " + \" and John think 2021.10.10 about everything. ";
		String nominho = "(John)";
		Pattern patternNominho = Pattern.compile(nominho);
		Matcher matcherNominho = patternNominho.matcher(text);
		StringBuffer stringBuffer = new StringBuffer();
		while (matcherNominho.find()) {
			System.out.println("found: "+ matcherNominho.group());
		}
		
	}
}
