package org.lessons.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prova {

	static Calculator calcolatrice;

	@BeforeAll
	static void initCalculator() {
		calcolatrice = new Calculator();
	}

	@Test
	@DisplayName("Test metodo Addizione")
	public void testAdd() {
		float result = calcolatrice.addizione(35, 25);
		assertEquals(result, 60);
	}

	@Test
	@DisplayName("Test metodo Sottrazione")
	public void testSubtract() {
		float result = calcolatrice.sottrazione(35, 10);
		assertEquals(result, 25);
	}

	@Test
	@DisplayName("Test metodo Moltiplicazione")
	public void testException() throws Exception {
		assertThrows(Exception.class, () -> calcolatrice.moltiplicazione(0, 0));
	}

	@Test
	@DisplayName("Test per ECCEZIONI metodo Moltiplicazione")
	public void testException2() throws Exception {
		assertThrows(Exception.class, () -> calcolatrice.divisione(0, 5));
	}

}
