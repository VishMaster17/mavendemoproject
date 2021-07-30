package io.github.vishmaster17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.github.vishmaster17.Calculator;

class CalculatorTest {
	
	Calculator c;

	@Test
	void addTest() {
		c = new Calculator();
		assertEquals(15, c.add(5, 10));
		
		
	}

}
