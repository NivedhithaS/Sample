/*
 * Copyright 2015 All Rights Reserved.
 */

package com.interview.parser;

/**
 * LineParser interface
 * 
 * @author <a href="mailto:jingyuzhang2008@gmail.com">Jingyu ZHANG</a>
 * @version  1.0
 * @since May 2016
 **/
public interface LineParser<T> {
	/**
	 * 
	 * @param line
	 *            contains a block of Item
	 * @return
	 */
	public T parseLine(String line);
}
