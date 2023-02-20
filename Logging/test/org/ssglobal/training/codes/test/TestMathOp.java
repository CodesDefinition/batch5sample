package org.ssglobal.training.codes.test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.MathOps;

public class TestMathOp {
	private MathOps op;

	@BeforeEach
	public void setup() {
		op = new MathOps();
	}

	@AfterEach
	public void tearDown() {
		op = null;
	}

	@Test
	public void testDivOp() {
		assertDoesNotThrow(() -> {
			int result = op.div(10, 2);
			assertEquals(5, result);
		});

	}

	@Test
	public void testDivOpRainy() {
		assertThrows(ArithmeticException.class, () -> {
			int result = op.div(10, 0);
			assertEquals(0, result);
		});
	}

	@Test
	public void testDispArray() {
		int[] testData = { 10, 20, 30, 40 };
		int[] result = op.displayArray(testData);
		assertSame(testData, result);
	}
	
	@Test
	public void testDispArrayRainy() {
		int[] testData = null;
		int[] result = op.displayArray(testData);
		assertSame(testData, result);
	}
	
	@Test
	public void testAddOP() {
		int result = op.add(2, 3);
		assertEquals(5, result);
	}
}
