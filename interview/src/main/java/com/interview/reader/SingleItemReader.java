/*
 * Copyright 2015 All Rights Reserved.
 */

package com.interview.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.interview.parser.LineParser;

/**
 * SingleItemReader class implements ItemReadder interface
 * 
 * @author <a href="mailto:jingyuzhang2008@gmail.com">Jingyu ZHANG</a>
 * @version  1.0
 * @since May 2016
 **/
public class SingleItemReader<T> implements ItemReader<T> {

	private final LineParser<T> parser;
	private BufferedReader bufferedReader;

	/**
	 * 
	 * @param parser
	 *            to parse file format documents
	 * @param file
	 *            the full path and name of a file
	 * @throws IOException
	 */
	public SingleItemReader(LineParser<T> parser, File file) throws Exception {
		if (file == null)
			throw new NullPointerException("The file can't be null");
		if (!file.exists())
			throw new IOException("File doesn't exist: "
					+ file.getAbsolutePath());
		if (!file.canRead())
			throw new IOException("Can't read file: " + file.getAbsolutePath());
		this.parser = parser;
		this.bufferedReader = new BufferedReader(new FileReader(file));
	}

	public T readLine() throws IOException {
		if (this.bufferedReader == null) {
			return null;
		}
		String line = this.bufferedReader.readLine();
		while (line != null) {
			T temp = parser.parseLine(line);
			if (temp != null)
				return temp;
			line = this.bufferedReader.readLine();
		}
		close();
		return null;
	}

	public void close() throws IOException {
		this.bufferedReader.close();
		this.bufferedReader = null;
	}
}
