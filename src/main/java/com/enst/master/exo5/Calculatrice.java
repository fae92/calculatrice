package com.enst.master.exo5;

public interface Calculatrice {

	/**
	 * 
	 * @param val1 has to be a positive number
	 * @param val2 has to be a positive number
	 * an {@link IllegalArgumentException} is thrown if one of arguments is negative
	 * @return va1 + val2 
	 */
	public long add(long val1, long val2);
	
	
	/**
	 * 
	 * @param val1
	 * @param val2
	 * @return va1 - val2
	 */
	public long substract(long val1, long val2);		
	
	
	/**
	 * 
	 * @param val1
	 * @param val2
	 * @return va1 - val2
	 */
	public long multiply(long val1, long val2);
	
	/**
	 * 
	 * @param val1
	 * @param val2
	 * an {@link IllegalArgumentException} is thrown if val2 is equal to zero 
	 * @return val1 / val2
	 */
	public long divide(long val1, long val2);	
	
}
