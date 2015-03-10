package com.enst.master.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatriceServiceImpl {
	
	@Autowired
	private Calculatrice cal;
	
	public Calculatrice getCal(){
		return this.cal ;
	}
	
	
	public void setCal(Calculatrice newCal){
		this.cal  = newCal;
	}
	
	

	/**
	 * Calculate sum of the long parameters
	 * 
	 * @param val1 : fist parameter
	 * @param val2 : second parameter
	 * @return add val1 and val2
	 */
	public long additionner(long val1, long val2) {

		//create calculatrice
		//make calculation
		//return result
		return this.getCal().add(val1, val2);
		
		//delete this fake return
		
	}
	
	/**
	 * Calculate difference between the two parameters 
	 * 
	 * @param val1 : fist parameter
	 * @param val2 : second parameter
	 * @return the difference between the two parameters
	 */
	public long soustraire(long val1, long val2) {

		//create calculatrice
		//make calculation
		//return result
		
		//delete this fake return
		return this.getCal().substract(val1, val2);
	}	
	
	/**
	 * 
	 * Calculate product of the two parameters 
	 * 
	 * @param val1 : fist parameter
	 * @param val2 : second parameter
	 * @return the product of the two parameters
	 */
	public long multiplier(long val1, long val2) {

		//create calculatrice
		//make calculation
		//return result
		
		//delete this fake return
		return this.getCal().multiply(val1, val2);
	}	
	

	/**
	 * 
	 * Calculate division between the two parameters 
	 * 
	 * @param val1 : fist parameter
	 * @param val2 : second parameter
	 * @return division of val1 by val2
	 */
	public long diviser(long val1, long val2) {

		//create calculatrice
		//make calculation
		//return result
		
		//delete this fake return
		return this.getCal().divide(val1, val2);
	}	
	
	/**
	 * Calculate the sum of the two first parameters and
	 * substract the third parameter from the previous result
	 * 
	 * @param val1 : fist parameter
	 * @param val2 : second parameter
	 * @param val3 : third parameter
	 * @return the obtained result
	 */
	public long calculer(long val1, long val2, long val3) {

		//create calculatrice
		CalculatriceImpl cal = (CalculatriceImpl) this.getCal();
		//make calculation add
		long tmp = cal.add(val1, val2);
		//make calculation substract on the temporary result
		long result = cal.substract(val3, tmp);
		//return result
		
		//delete this fake return
		return result;
	}

}
