/*
 * Copyright 2015 All Rights Reserved.
 */

package com.interview.model;

/**
 * ItemUnit to parser Unit in the Item
 * 
 * @author <a href="mailto:jingyuzhang2008@gmail.com">Jingyu ZHANG</a>
 * @version  1.0
 * @since May 2016
 **/
public enum ItemUnit {
	 HIGHEST, LOWEST;
	/**
	 * 
	 * @param str
	 *            is the string format of ItemUnit
	 * @return
	 */
	public static ItemUnit getUnit(String str) {
		switch (str.toLowerCase()) {
		case "highest":
			return HIGHEST;
		case "lowest":
			return LOWEST;
		default:
			return null;
		}

	}
}
