package com.crud.implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	@Test
	void testSomar() {
		System.out.println("somar");
		int n1 = 5;
		int n2 = 5;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 10.0;
		double resultado = calculadorinhaTeste.aumentar(n1, n2);
		assertEquals(resultadoEsperado, resultado, 0);
	}
	
	@Test
	void testSubtrair() {
		System.out.println("subtrair");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 2.0;
		double resultado = calculadorinhaTeste.diminuir(n1, n2);
		System.out.println(resultado);
		assertEquals(resultadoEsperado, resultado, 0);
	}
	
	@Test
	void testMultiplicacao() {
		System.out.println("multiplicar");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 15.0;
		double resultado = calculadorinhaTeste.multiplicar(n1, n2);
		assertEquals(resultadoEsperado, resultado, 0);
	}
	
	@Test
	void testDividir() {
		System.out.println("dividir");
		int n1 = 5;
		int n2 = 1;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 5.0;
		double resultado = calculadorinhaTeste.dividir(n1, n2);
		assertEquals(resultadoEsperado, resultado, 0);
	}
	
	@Test
	void testResto() {
		System.out.println("resto");
		int n1 = 9;
		int n2 = 2;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 1.0;
		double resultado = calculadorinhaTeste.resto(n1, n2);
		assertEquals(resultadoEsperado, resultado, 0);
	}



}
