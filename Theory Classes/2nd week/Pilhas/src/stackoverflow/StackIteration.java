package stackoverflow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stackList = new Stack<>();
		stackList.push(68);
		stackList.push(1198);
		stackList.push(58);
		stackList.pop();
		
		ArrayList<String> listArray = new ArrayList<>();
		listArray.add("ArrayList 1");
		listArray.add("ArrayList 2");
		
		List<String> list = new ArrayList<>();
		list.add("List 1");
		list.add("List 2");
		
		System.out.println("iterar lista");
		Iterator<String> iteratorList = list.iterator();
		while (iteratorList.hasNext()) {
			String iterado = iteratorList.next();
			System.out.println(iterado);
		}
		
		System.out.println("iterar lista");
		Iterator<String> iteratorListArray = list.iterator();
		while (iteratorListArray.hasNext()) {
			String iterado = iteratorListArray.next();
			System.out.println(iterado);
		}
	
		System.out.println("iterar lista");
		Iterator<String> iteratorListStack = list.iterator();
		while (iteratorListStack.hasNext()) {
			String iterado = iteratorListStack.next();
			System.out.println(iterado);
		}
	

	}

}
