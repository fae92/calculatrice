package com.enst.master.exo5;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;  

import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;  

public class ServiceCalculatriceTest {
	
	  private Calculatrice calculatriceMock = null;

	  private ServiceCalculatrice monService = null;
	  

	public void setUp() throws Exception {

		// link dependency between the calculatriceMock obeing to the
		// interface Calculatrice and the Service using it
		monService = new ServiceCalculatrice() {
			@Override
			protected Calculatrice creerCalculatrice() {

				// mock is already instanciated with @Mock annotation
				// just return it instead of the null return
				return null;
			}
		};
	}
	  
	  
	  public void tearDown()  {
	    calculatriceMock = null;

	    monService = null;
	  }
	  
	  
	  
	  @Test
	  public void additionnerTest() throws Exception {
		  //when simulates the add method
		  when(calculatriceMock.add(1l, 2l)).thenReturn(3l);

		  //execute service additionner
		  
		  //assert result
		  
		  //verify call calculatriceMock.add
	  }
	  

	  @Test
	  public void soustraireTest() throws Exception {
		  //when simulates substract method

		  //execute service soustraire
		  
		  //assert result
		  
		  //verify call calculatriceMock.substract
		  verify(calculatriceMock).substract(3l, 2l);
	  }


	  @Ignore
	  @Test
	  public void mulitplierTest() throws Exception {
		  //when simulates multiply method

		  //execute service multiplier
		  
		  //assert result
		  
		  //verify call calculatriceMock.multiplu
	  }	  
	  
	  
	  
	  @Test
	  public void diviserTest() throws Exception {
		  //when simulates divide method

		  //execute service diviser
		  
		  //assert call

		  //verify call calculatriceMock.divide
	  }	  
	  
	  @Test
	  public void calculerTest() throws Exception {
		  //when simulates add method
		  
		  //when simulates substract method
		  
		  //execute service
		  
		  //assert
		  
		  //verify call calculatrice.add method

		  //verify call off calculatrice.substract method

	  } 

	  
	  
}
