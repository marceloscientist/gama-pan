import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes(utf8);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);
		
		/*
		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes();
		String s2 = new String(bytes, "UTF-8");
		System.out.println(s2); */
	}

}
