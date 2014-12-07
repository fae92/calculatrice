package com.enst.master.exo5;


public class ServiceCalculatrice {

	protected Calculatrice creerCalculatrice() {
		return new CalculatriceImpl();
	}

	/**
	 * Calculate sum of the long parameters
	 * 
	 * @param val1 : fist parameter
	 * @param val2 : second parameter
	 * @return add val1 and val2
	 */
	public long additionner(long val1, long val2) {

		Calculatrice calculatrice = creerCalculatrice();
		long retour = calculatrice.add(val1, val2);
		return retour;
	}
	
	/**
	 * Calculate difference between the two parameters 
	 * 
	 * @param val1 : fist parameter
	 * @param val2 : second parameter
	 * @return the difference between the two parameters
	 */
	public long soustraire(long val1, long val2) {

		Calculatrice calculatrice = creerCalculatrice();
		long retour = calculatrice.substract(val1, val2);
		return retour;
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

		Calculatrice calculatrice = creerCalculatrice();
		long retour = calculatrice.multiply(val1, val2);
		return retour;
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

		Calculatrice calculatrice = creerCalculatrice();
		long retour = calculatrice.divide(val1, val2);
		return retour;
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
		Calculatrice calculatrice = creerCalculatrice();

		long somme = calculatrice.add(val1, val2);
		long retour = calculatrice.substract(somme, val3);

		return retour;
	}

}
