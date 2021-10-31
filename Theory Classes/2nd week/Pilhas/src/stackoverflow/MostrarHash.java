package stackoverflow;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MostrarHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(456);
		
		Iterator<Integer> iterator = tree.iterator();
		System.out.println("Tree set data: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
		
		HashSet<Integer> dset = new HashSet<Integer>();
		dset.add(12);
		dset.add(63);
		dset.add(456);
		
		Iterator<Integer> iteratorHS = dset.iterator();
		System.out.println("HashSet: ");
		while(iteratorHS.hasNext()) {
			System.out.println(iteratorHS.next() + " ");
		}
		System.out.println();

	
	}

}
