package com.enst.master.exo5;


public class ServiceCalculatrice {

	protected Calculatrice creerCalculatrice() {
		return new CalculatriceImpl();
	}

	/**
	 * Calculer la somme de deux entiers positifs
	 * 
	 * @param val1
	 *            la premiere valeur
	 * @param val2
	 *            la seconde valeur
	 * @return la somme des deux arguments ou -1 si un des deux arguments est
	 *         negatif
	 */
	public long additionner(long val1, long val2) {
		long retour = 0l;
		Calculatrice calculatrice = creerCalculatrice();

		try {
			retour = calculatrice.add(val1, val2);
		} catch (IllegalArgumentException iae) {
			retour = -1l;
		}

		return retour;
	}

	/**
	 * Calculer la somme de deux premiers parametres et soustraire la valeur du
	 * troisième
	 * 
	 * @param val1
	 * @param val2
	 * @param val3
	 * @return le resultat du calcul
	 */
	public long calculer(long val1, long val2, long val3) {
		long retour = 0l;
		Calculatrice calculatrice = creerCalculatrice();

		try {
			long somme = calculatrice.add(val1, val2);
			retour = calculatrice.substract(somme, val3);
		} catch (IllegalArgumentException iae) {
			retour = -1l;
		}

		return retour;
	}

}
