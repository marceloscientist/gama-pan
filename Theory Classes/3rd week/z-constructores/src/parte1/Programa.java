package parte1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product produtinho = new Product();

		System.out.println("Name: ");
		produtinho.name = sc.nextLine();
		System.out.println("Price: ");
		produtinho.price = sc.nextDouble();
		
		if(sc.hasNextInt()) {
			System.out.println("Quantidade no estoque: ");
			produtinho.quantity = sc.nextInt();
		}
		System.out.println();
		System.out.println("Product data "+ produtinho);
		sc.close();

	}

}
