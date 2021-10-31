package br.com.pacote;

import java.lang.reflect.Method;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			Object objetinho = Class.forName("br.com.pacote.Pessoa").newInstance();
			Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
			metodinho.setAccessible(true);
			String nome = (String) metodinho.invoke(objetinho, "");
			System.out.println(nome);
			*/
			Object carro = Class.forName("br.com.pacote.Carro").newInstance();
			Method pegarNomeCarro = carro.getClass().getDeclaredMethod("pegarNomeCarro", String.class);
			pegarNomeCarro.setAccessible(true);
			String Onix = (String) pegarNomeCarro.invoke(carro, "");
			System.out.println(Onix);
					
			
		} catch (Exception e){
			e.printStackTrace();
		}

	}

}
