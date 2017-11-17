/*
 * Copyright 2015 All Rights Reserved.
 */

package com.interview.reader;

import java.io.IOException;

/**
 * ItemReader interface
 * 
 * @author <a href="mailto:jingyuzhang2008@gmail.com">Jingyu ZHANG</a>
 * @version  1.0
 * @since May 2016
 **/
public interface ItemReader<T> {
	public T readLine() throws IOException;
}