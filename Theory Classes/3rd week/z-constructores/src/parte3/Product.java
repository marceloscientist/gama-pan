package parte3;

public class Product {
	public String name;
	public double price; 
	public int quantity; 
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String toString() {
		return name + ", $ " + price + ", " + quantity;
	}
}
