package parte3;

import java.util.Locale;
import java.util.Scanner;

import parte3.Product;

public class Programa {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();

		System.out.println("Quantity: ");
		int quantity = sc.nextInt();

		if(sc.hasNextInt()) {
			Product produtinho = new Product(name, price, quantity);
			System.out.println();
			System.out.println("Product data "+ produtinho);
		} else {
			Product produtinho = new Product(name, price);
			System.out.println();
			System.out.println("Product data "+ produtinho);		
		}
		sc.close();
		
	}
}
