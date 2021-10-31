package com.crud.implementation;

public class Calculadora {
	public int resultado = 0;
	
	public double aumentar (int n1, int n2) {
		return n1 + n2;
	}
	
	public double diminuir(int n1, int n2) {
		return n1 - n2;	
	}
	
	public double multiplicar(int n1, int n2) {
		return n1 * n2;
	}
	
	public double dividir(int n1, int n2) {
		return n1 / n2;
	}
	
	public double resto(int n1, int n2) {
		return n1 % n2;
	}
}
