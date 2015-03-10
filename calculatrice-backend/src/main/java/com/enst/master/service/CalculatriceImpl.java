package com.enst.master.service;

import org.springframework.stereotype.Component;


@Component
public class CalculatriceImpl implements Calculatrice {

	public static final String ERR_ARG_CANNOT_BE_NEGATIVE = "Arguments cannot be negative";
	
	public static final String ERR_ARG_CANNOT_BE_NULL = "Arguments cannot be null";
	
	/*
	 * (non-Javadoc)
	 * @see com.enst.master.exo3.Calculatrice#add(long, long)
	 */
	public long add(long val1, long val2) {
		// if val1 < 0 or val2 < 0 throw new IllegalArgumentException(ERR_ARG_CANNOT_BE_NEGATIVE);
		//TODO code return
		if ( val1<0 || val2<0 ) {
			throw new IllegalArgumentException(ERR_ARG_CANNOT_BE_NEGATIVE);
		} else {
			return val1+val2;
			// TODO: handle exception
		}
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.enst.master.exo3.Calculatrice#substract(long, long)
	 */
	public long substract(long val1, long val2) {
		return val1-val2;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.enst.master.service.Calculatrice#multiply(long, long)
	 */
	public long multiply(long val1, long val2) {
		return val1*val2;
	}

	/*
	 * (non-Javadoc)
	 * @see com.enst.master.service.Calculatrice#divide(long, long)
	 */
	public long divide(long val1, long val2) {
		// if val2 is == 0 throw new IllegalArgumentException(ERR_ARG_CANNOT_BE_NULL);
		if (val2 != 0){
			return val1/val2;
		} else {
			throw new IllegalArgumentException(ERR_ARG_CANNOT_BE_NULL);
		}
		
	}

	


}
