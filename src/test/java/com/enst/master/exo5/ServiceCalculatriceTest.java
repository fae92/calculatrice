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
		  //when simulates the add method
		  when(calculatriceMock.add(1l, 2l)).thenReturn(3l);

		  //execute service additionner
		  long result = monService.additionner(1l, 2l);
		  
		  //assert result
		  assertEquals(3l, result);
		  
		  //verify call calculatriceMock.add
		  verify(calculatriceMock).add(1l, 2l);
	  }
	  

	  @Test
	  public void soustraireTest() throws Exception {
		  //when simulates substract method
		  when(calculatriceMock.substract(3l, 2l)).thenReturn(1l);

		  //execute service soustraire
		  long result = monService.soustraire(3l, 2l);
		  
		  //assert result
		  assertEquals(1l, result);
		  
		  //verify call calculatriceMock.substract
		  verify(calculatriceMock).substract(3l, 2l);
	  }


	  @Test
	  public void mulitplierTest() throws Exception {
		  //when simulates multiply method
		  when(calculatriceMock.multiply(3l, 2l)).thenReturn(6l);

		  //execute service multiplier
		  long result = monService.multiplier(3l, 2l);
		  
		  //assert result
		  assertEquals(6l, result);
		  
		  //verify call calculatriceMock.multiplu
		  verify(calculatriceMock).multiply(3l, 2l);
	  }	  
	  
	  
	  @Test
	  public void diviserTest() throws Exception {
		  //when simulates divide method
		  when(calculatriceMock.divide(4l, 2l)).thenReturn(2l);

		  //execute service diviser
		  long result = monService.diviser(4l, 2l);
		  
		  //assert call
		  assertEquals(2l, result);

		  //verify call calculatriceMock.divide
		  verify(calculatriceMock).divide(4l, 2l);
	  }	  
	  
	  
	  @Test
	  public void calculerTest() throws Exception {
		  //when simulates add method
		  when(calculatriceMock.add(100l, 20l)).thenReturn(120l);
		  
		  //when simulates substract method
		  when(calculatriceMock.substract(120l, 10l)).thenReturn(110l);
		  
		  //execute service
		  long result = monService.calculer(100l, 20l, 10l);
		  
		  //assert
		  assertEquals(110l, result);
		  
		  //verify call calculatrice.add method
		  verify(calculatriceMock).add(100l, 20l);

		  //verify call off calculatrice.substract method
		  verify(calculatriceMock).substract(120l,10l);

	  } 

	  
	  
}
