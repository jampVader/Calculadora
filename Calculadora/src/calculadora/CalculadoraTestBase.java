package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTestBase {

	@Test
	public void testSuma() {
		int result = Calculadora.suma(6, 6);
		int resCorrecto = 12;
		assertEquals(resCorrecto, result);
	}
	
	@Test
	public void testResta() {
		int result = Calculadora.resta(6, 6);
		int resCorrecto = 0;
		assertEquals(resCorrecto, result);
	}

	@Test
	public void testMultiplicar() {
		int result = Calculadora.multiplicar(5, 8);
		int resCorrecto = 40;
		assertEquals(resCorrecto, result);
	}

	@Test
	public void testDividir() {
		int result = Calculadora.dividir(12, 2);
		int resCorrecto = 6;
		assertEquals(resCorrecto, result);
	}

	@Test
	public void testEsPositivo() {
		boolean result = Calculadora.esPositivo(-6);
		boolean resCorrecto = false;
		assertEquals(resCorrecto, result);
	}

}
