package arrays;

import java.util.HashMap;

public class HashIfFor0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitais = new HashMap<String, String>();
		capitais.put("Inglaterra","Londres");
		capitais.put("Alemanha","Berlim");
		capitais.put("Brasil","Brasilia");
		
		for(String i: capitais.keySet()) {
			if(i != "Inglaterra") System.out.println(i);
		}
		
		
		
		

	}

}
