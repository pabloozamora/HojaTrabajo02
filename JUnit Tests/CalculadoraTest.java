import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testEvaluate1() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.Evaluate("1 2 +");
		assertEquals(3,resultado);
	}
	
	@Test
	void testEvaluate2() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.Evaluate("4 2 -");
		assertEquals(2,resultado);
	}
	
	@Test
	void testEvaluate3() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.Evaluate("2 2 *");
		assertEquals(4,resultado);
	}
	
	@Test
	void testEvaluate4() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.Evaluate("4 2 /");
		assertEquals(2,resultado);
	}

}
