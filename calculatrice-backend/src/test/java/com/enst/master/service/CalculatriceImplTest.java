package com.enst.master.service;



import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import com.enst.master.service.Calculatrice;
import com.enst.master.service.CalculatriceImpl;

public class CalculatriceImplTest {

	private Calculatrice calculatrice;

	
	@Before
	public void setUp() {
		calculatrice = new CalculatriceImpl();
	}

	@After
	public void tearDown() {
		calculatrice = null;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAdd() throws IllegalArgumentException{
		
		// execute the method
		long result = calculatrice.add(2, 0);
		//assert that the result is good
		Assert.assertEquals(4, result);
	}

	@Test
	public void testSubstract() {
		// execute the method
		long result = calculatrice.substract(2, 2);
		
		//assert that the result is good
		Assert.assertEquals(0, result);
	}
	
	
	@Test
	public void testMultiply() {
		
		
		// execute the method
		long result = calculatrice.multiply(2, 3);
		
		//assert that the result is good
		Assert.assertEquals(6, result);
		
		//Assert.assertEquals ... the rest of your code;
	}	
	

    @Rule
    public ExpectedException exception = ExpectedException.none();
	
    @Test(expected = IllegalArgumentException.class)
	public void testDivide(){
		// execute the method
		long result = calculatrice.divide(2, 0);
		
		//assert that the result is good
		Assert.assertEquals(4, result);

	}	
	
	@Test
	public void throwsIllExcepifNeg() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(CalculatriceImpl.ERR_ARG_CANNOT_BE_NEGATIVE.toString());
		new CalculatriceImpl().add(2, 0);
		
	}
	
	@Test
	public void throwsIllExcepifVal2isequalToZero() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(CalculatriceImpl.ERR_ARG_CANNOT_BE_NULL);
		new CalculatriceImpl().divide(2, 0);
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