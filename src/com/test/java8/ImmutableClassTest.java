package com.test.java8;

import java.util.Map;

/**
 * make the class as final
 * 
 * 
 * 
 */
final class ImmutableClassTest {
	private final String name;
	private final int regNo;
	private final Map<String, String> metaData;

	/**
	 * @param name
	 * @param regNo
	 * @param metaData
	 */
	public ImmutableClassTest(String name, int regNo, Map<String, String> metaData) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.metaData = metaData;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Map<String, String> getMetaData() {
		return metaData;
	}

}
