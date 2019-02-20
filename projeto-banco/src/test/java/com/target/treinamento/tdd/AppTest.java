package com.target.treinamento.tdd;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest{
	
	@Test
	public void testSomaDoisNumerosEIgualASete() {
		double valorA = 2.0;
		double valorB = 5.0;
		Calculadora calculadora = new Calculadora();
		double soma = calculadora.soma(valorA, valorB);
		
		assertEquals(7.0, soma);
	}
	
	@Test
	public void testSomaDoisNumerosEIgualADez() {
		double valorA = 5.0;
		double valorB = 5.0;
		Calculadora calculadora = new Calculadora();
		double soma = calculadora.soma(valorA, valorB);
		
		assertEquals(10.0, soma);
	}
	
	@Test
	public void testSomaDoisNumerosEIgualDouble() {
		double valorA = 5.0;
		double valorB = 2.0;
		Calculadora calculadora = new Calculadora();
		Double soma = calculadora.soma(valorA, valorB);
		
		assertEquals(Double.valueOf(7.0), soma);
	}
	
	@Test
	public void testSomaDoisNumerosEIgualNull() {
		double valorB = 2.0;
		Calculadora calculadora = new Calculadora();
		Double soma = calculadora.soma(null, valorB);

		assertEquals(Double.valueOf(7.0), soma);
	}
	
	
}
