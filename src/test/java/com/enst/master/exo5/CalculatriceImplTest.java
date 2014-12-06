package com.enst.master.exo5;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatriceImplTest {

	private Calculatrice calculatrice;

	
	@Before
	public void setUp() {
		calculatrice = new CalculatriceImpl();
	}


	@Test
	public void testAdd() {
		long result = calculatrice.add(1, 2);
		Assert.assertEquals(3, result);
	}

	@Test
	public void testSubstract() {
		long result = calculatrice.substract(4, 2);
		Assert.assertEquals(2, result);
	}
	
	
	@Test
	public void testMultiply() {
		// execute the method
		long result = calculatrice.multiply(2, 2);
		
		//assert that the result is good
		Assert.assertEquals(4, result);
	}	

	@Test
	public void testMultiplyWithVerify() {

		// execute the method
		long result = calculatrice.multiply(2, 2);
		
		//assert that the result is good
		Assert.assertEquals(4, result);

	}	
	
	
	
	@Test
	public void testDivide() {
		long result = calculatrice.divide(2, 2);
		Assert.assertEquals(1, result);
	}	
	
	
	/*
	 * Before JUnit 4.7 version - just one step in the test
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgument() throws Exception {
		calculatrice.add(-1, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		calculatrice.divide(2, 0);
	}	

	
	
	/*
	 * After JUnit 4.7 version - step 1
	 */	
	
	@Rule public ExpectedException thrown = ExpectedException.none();		
	
	/*
	 * After JUnit 4.7 version - step 2
	 */
	@Test
	public void testAddNegativeFigureExpectedException() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(CalculatriceImpl.ERR_ARG_CANNOT_BE_NEGATIVE);
		calculatrice.add(1L, -1L);
	}
	
	@Test
	public void testDivideByZeroExpectedException() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(CalculatriceImpl.ERR_ARG_CANNOT_BE_NULL);
		calculatrice.divide(1, 0);
	}	
	

}