package com.target.treinamento.tdd;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class calculadoraTest{
	
	// testa soma
	@Test
	public void testSomaDoisNumerosEIgualASete() {
		double valorA = 2.0;
		double valorB = 5.0;
		Calculadora calculadora = new Calculadora();
		double soma = calculadora.soma(valorA, valorB);
		
		assertEquals(7.0, soma,0);
	}
	
	
	@Test
	public void testSomaDoisNumerosEIgualDouble() {
		double valorA = 5.0;
		double valorB = 2.0;
		Calculadora calculadora = new Calculadora();
		Double soma = calculadora.soma(valorA, valorB);
		
		assertEquals(Double.valueOf(7.0), soma);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSomaPrimeirtoNumerosIgualNull() {
		double valorB = 2.0;
		Calculadora calculadora = new Calculadora();
		Double soma = calculadora.soma(null, valorB);
		
		assertEquals(Double.valueOf(7.0), soma);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSomaSegungoNumerosIgualNull() {
		double valorA = 2.0;
		Calculadora calculadora = new Calculadora();
		Double soma = calculadora.soma(valorA, null);

		assertEquals(Double.valueOf(7.0), soma);
	}

	// testa multiplicação
	@Test
	public void testmultiplicaIgualAquinze() {
		double valorA = 3.0;
		double valorB = 5.0;
		Calculadora calculadora = new Calculadora();
		Double produto = calculadora.multiplica(valorA, valorB);
		
		assertEquals(Double.valueOf(15.0), produto);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicaPrimeiroIgualANull() {
		//double valorA = 3.0;
		double valorB = 5.0;
		Calculadora calculadora = new Calculadora();
		Double produto = calculadora.multiplica(null, valorB);
		
		assertEquals(Double.valueOf(15.0), produto);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicaSegundoIgualANull() {
		double valorA = 3.0;
		//double valorB = 5.0;
		Calculadora calculadora = new Calculadora();
		Double produto = calculadora.multiplica(valorA, null);
		
		assertEquals(Double.valueOf(15.0), produto);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicaSegundoIgualANull() {
		double valorA = 3.0;
		//double valorB = 5.0;
		Calculadora calculadora = new Calculadora();
		Double produto = calculadora.multiplica(valorA, null);
		
		assertEquals(Double.valueOf(15.0), produto);
	}
	
	
}

