package stackoverflow;

import java.util.Stack;

public class Pilhas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> pilha = new Stack<>();
		boolean result = pilha.empty();
		System.out.println("A pilha est� vazia??" + result);
		
		pilha.push(68);
		pilha.push(1198);
		pilha.push(58);
		pilha.pop();
		
		System.out.println("Elementos da stack "+ pilha);
		result = pilha.empty();
		System.out.println("Est� vazia??? "+ result);
		System.out.println("Est� vazia??? "+ pilha);
				

	}

}
