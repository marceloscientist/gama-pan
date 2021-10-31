package programa;

import java.util.Stack;

public class ProgramaPilha extends PilhaRepo {
	public static void main(String[] args) {
		Stack<String> pilhinha = new Stack();
		System.out.println("stack: "+ pilhinha);
		inserindoPush(pilhinha, "Caixa ac 110");
		inserindoPush(pilhinha, "Caixa ac 220");
		inserindoPush(pilhinha, "Note");
		deletandoPop(pilhinha);
		deletandoPop(pilhinha);	
	}
}
