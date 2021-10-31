package entradas;

import java.util.Scanner;

public class ScanOutrosTipos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Short: ");
		short shortinho = ler.nextShort();	
		
		System.out.println("Long: ");
		long longuinho = ler.nextLong();
		
		System.out.println(shortinho);
		System.out.println(longuinho);	
		
		ler.close();
	}	
}
