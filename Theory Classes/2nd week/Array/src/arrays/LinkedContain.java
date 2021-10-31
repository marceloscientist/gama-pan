package arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedContain {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Fox");
		cars.add("gol");

		cars.contains("Fox");
		cars.addFirst("Palio");
		cars.addLast("Mazda");
		cars.get(0);
		cars.getLast();
		cars.clear();
		
	}
}
