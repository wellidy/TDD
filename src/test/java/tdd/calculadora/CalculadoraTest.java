package tdd.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumeros() {
		int valorA = 1;
		int valorB = 2;
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisNumeros() {
		int valorA = 9;
		int valorB = 5;
		
		Calculadora calculadora = new Calculadora();
		int subtracao = calculadora.subtracao(valorA, valorB);
		
		assertEquals(4, subtracao);
		
	}
	
	@Test
	public void deveriaSubtrairUmNumeroMenorQueOOutroEResultarEmNegativo() {
		int valorA = 5;
		int valorB = 8;
		
		Calculadora calculadora = new Calculadora();
		int subtracao = calculadora.subtracao(valorA, valorB);
		
		assertEquals(-3, subtracao);
	}

	
	@Test
	public void deveriaDividirUmNumeroPeloOutro() {
		int valorA = 6;
		int valorB = 3;
		
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divisao(valorA, valorB);
		
		assertEquals(2, divisao);
		
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void deveriaEvitarDivisaoPorZero() {
		int valorA = 6;
		int valorB = 0;
		
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divisao(valorA, valorB);
		
		assertEquals(2, divisao);

		
	}
}
