package parte2;

import java.util.Locale;
import java.util.Scanner;

import parte2.Product;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		int quantity = sc.nextInt();

		Product produtinho = new Product(name, price, quantity);


		System.out.println();
		System.out.println("Product data "+ produtinho);
		sc.close();

		
	}
}
