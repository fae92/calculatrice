package com.enst.master.exo5;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;  

import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;  

@RunWith(MockitoJUnitRunner.class)
public class ServiceCalculatriceTest {
	
	  @Mock
	  private Calculatrice calculatriceMock = null;

	  private ServiceCalculatrice monService = null;
	  

	  @Before
	  public void setUp() throws Exception {

		  //link dependency between the calculatriceMock obeing to the 
		  // interface Calculatrice and the Service using it
		  monService = new ServiceCalculatrice() {
	      @Override
	      protected Calculatrice creerCalculatrice() {
	        return calculatriceMock;
	      }
	    };
	  }
	  
	  
	  @After
	  public void tearDown()  {
	    calculatriceMock = null;

	    monService = null;
	  }
	  
	  
	  
	  @Test
	  public void additionnerTest() throws Exception {
		  when(calculatriceMock.add(1l, 2l)).thenReturn(3l);

		  long result = monService.additionner(1l, 2l);
		  
		  assertEquals(3l, result);
		  
		  verify(calculatriceMock).add(1l, 2l);
	  }

	  
	  
	  @Test
	  public void calculerTest() throws Exception {
		  when(calculatriceMock.add(100l, 20l)).thenReturn(120l);
		  when(calculatriceMock.substract(120l, 10l)).thenReturn(110l);
		  
		  long result = monService.calculer(100l, 20l, 10l);
		  
		  assertEquals(110l, result);
		  
		  verify(calculatriceMock).add(100l, 20l);
		  verify(calculatriceMock).substract(120l,10l);

	  } 

	  
	  
}
