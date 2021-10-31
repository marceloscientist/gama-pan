package stackoverflow;

import java.util.HashSet;

public class HashSets {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Gol");
		cars.add("Fox");
		cars.add("Eco");
		
		for(String i: cars) {
			System.out.println(i);
		}
		for(String i: cars) {
			if(i.contains("co")) {
				System.out.println(i);			
			}
		}
		
		cars.forEach(System.out::println);
	}
}
