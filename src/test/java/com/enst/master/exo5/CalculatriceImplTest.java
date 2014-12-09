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
	}

	@Test
	public void testSubstract() {
	}
	
	
	@Test
	public void testMultiply() {
		// execute the method
		
		//assert that the result is good
		//Assert.assertEquals ... the rest of your code;
	}	
	
	
	
	@Test
	public void testDivide() {

	}	
	
	
	/*
	 * Before JUnit 4.7 version - just one step in the test
	 */
	//@Test(... something to add here)
	public void testIllegalArgument() throws Exception {
		calculatrice.add(-1, 1);
	}

	//@Test(... something to add here)
	public void testDivideByZero() {
		calculatrice.divide(2, 0);
	}	

	
	
	/*
	 * After JUnit 4.7 version - step 1
	 */	
	
	// ... create @Rule Annotated code		
	
	/*
	 * After JUnit 4.7 version - step 2
	 */

	public void testAddNegativeFigureExpectedException() throws Exception {
	}
	
	public void testDivideByZeroExpectedException() throws Exception {
	}	
	

}