package com.enst.master.exo5;

public class CalculatriceImpl implements Calculatrice {

	public static final String ERR_ARG_CANNOT_BE_NEGATIVE = "Arguments cannot be negative";
	
	public static final String ERR_ARG_CANNOT_BE_NULL = "Arguments cannot be null";
	
	/*
	 * (non-Javadoc)
	 * @see com.enst.master.exo3.Calculatrice#add(long, long)
	 */
	public long add(long val1, long val2) {
		if (val1 < 0 || val2 < 0) throw new IllegalArgumentException(ERR_ARG_CANNOT_BE_NEGATIVE);
		return val1 + val2;
	}

	/*
	 * (non-Javadoc)
	 * @see com.enst.master.exo3.Calculatrice#substract(long, long)
	 */
	public long substract(long val1, long val2) {
		return val1 - val2;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.enst.master.exo5.Calculatrice#multiply(long, long)
	 */
	public long multiply(long val1, long val2) {
		return val1 * val2;
	}

	/*
	 * (non-Javadoc)
	 * @see com.enst.master.exo5.Calculatrice#divide(long, long)
	 */
	public long divide(long val1, long val2) {
		if (val2 == 0) throw new IllegalArgumentException(ERR_ARG_CANNOT_BE_NULL);
		return val1/val2;
	}

	


}
