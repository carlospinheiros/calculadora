package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void testCalculadoraSoma() {
		
		Calculadora op1 = new Calculadora();
		
		double n1 = 4;
        double n2 = 2;
        double expected = 6;
        
		assertEquals(expected, op1.soma(n1,n2),0);
	}
	
	@Test
	public void testCalculadoraSubtracao() {
		
		Calculadora op2 = new Calculadora();
		
		double n1 = -14;
        double n2 = -2;
        double expected = -12;
        
		assertEquals(expected, op2.subtracao(n1,n2),0);
	}
	
	@Test
	public void testCalculadoraMultiplicacao() {
		
		Calculadora op3 = new Calculadora();
		
		double n1 = 4;
        double n2 = 2;
        double expected = 8;
        
		assertEquals(expected, op3.multiplicacao(n1,n2),0);
	}
	
	@Test
	public void testCalculadoraDivisao() {
		
		Calculadora op4 = new Calculadora();
		
		double n1 = 4;
        double n2 = 2;
        double expected = 2;
		assertEquals(expected, op4.divisao(n1,n2),0);
	}
	
	@Test
	public void testCalculadoraDivisaoInvalido() {
		try {
			Calculadora op5 = new Calculadora();
			
			double n1 = 4;
	        double n2 = 0;
			op5.divisao(n1,n2);
			fail();
		} catch (ArithmeticException ex) {
			assertEquals("Não é possível dividir por zero!", ex.getMessage());
		}
	}
	
	@Test
	public void testCalculadoraExponenciacao() {
		
		Calculadora op6 = new Calculadora();
		
		double n1 = 6;
        double n2 = 2;
        double expected = 36;
        
		assertEquals(expected, op6.exponenciacao(n1,n2),0);
	}
	
	@Test
	public void testCalculadoraRaizQuadrada() {
		
		Calculadora op7 = new Calculadora();
		
		double n = 25;
        double expected = 5;
        
		assertEquals(expected, op7.raizquadrada(n),0);
	}
	
}
