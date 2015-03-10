package com.enst.master.service;


import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({"classpath:/applicationContext­-configuration-­test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CalculatriceServiceImplSpringTest {
	
	  @Mock
	  private Calculatrice calculatriceMock = null;

	  @InjectMocks
	  private CalculatriceServiceImpl monService = null;
	  
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
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
		  Assert.assertEquals(3l , result);
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
		  Assert.assertEquals( result , 1l);
		  //verify call calculatriceMock.substract
		  verify(calculatriceMock).substract(3l, 2l);
	  }


	  
	  @Test
	  public void mulitplierTest() throws Exception {
		  //when simulates multiply method
		  when(calculatriceMock.multiply(2l, 2l)).thenReturn(4l);
		  //execute service multiplier
		  long result = monService.multiplier(2l, 2l);
		  //assert result
		  Assert.assertEquals(result, 4l);
		  //verify call calculatriceMock.multiply
		  verify(calculatriceMock).multiply(2l, 2l);
	  }	  
	  
	  
	  
	  @Test
	  public void diviserTest() throws Exception {
		  //when simulates divide method
		  when(calculatriceMock.divide(2l, 1l)).thenReturn(2l);
		  //execute service diviser
		  long result = monService.diviser(2l, 1l);
		  //assert call
		  Assert.assertEquals(result, 2l);
		  //verify call calculatriceMock.divide
		  verify(calculatriceMock).divide(2l, 1l);
	  }	  
	  
	  @Test
	  public void calculerTest() throws Exception {
		  //when simulates add method
		  when(calculatriceMock.add(2l, 1l)).thenReturn(3l);
		  //when simulates substract method
		  when(calculatriceMock.substract(3l, 2l)).thenReturn(1l);
		  //execute service
		  long result = monService.additionner(2l, 1l);
		  result = monService.soustraire(result, 2l);
		  //assert
		  
		  //verify call calculatrice.add method
		  verify(calculatriceMock).add(2l, 1l);
		  //verify call off calculatrice.substract method
		  verify(calculatriceMock).substract(3l, 2l);
	  } 

	  
	  
}
