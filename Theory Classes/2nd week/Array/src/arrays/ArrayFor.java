package arrays;

import java.util.ArrayList;

public class ArrayFor {
	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList<String>();
		pessoas.add("Luiza");
		pessoas.add("Marcos");
		System.out.println("--- Todos ---");
		for(String pessoinha: pessoas) {
			System.out.printf("Posição %s \n", pessoinha);
		}
		System.out.println("Começa com L");
		for(String pessoinha: pessoas) 
			if(pessoinha.charAt(0) == 'L') 
				System.out.printf("Posição %s \n", pessoinha);
		
		System.out.println("--- Pessoas e indices ---");
		System.out.println("--- De um em um ---");
		int i = 0;
		for(String pessoinha: pessoas) {
			System.out.printf("Posição %d - %s \n", i, pessoinha); i++;
		}
		
		
				
	}
}
