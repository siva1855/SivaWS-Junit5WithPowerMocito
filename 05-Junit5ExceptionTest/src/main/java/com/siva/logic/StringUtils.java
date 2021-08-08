package com.siva.logic;

public class StringUtils {

	public static Integer stringconvertToInt(String str) {
		if (str == null || str.trim().length() == 0) {
			throw new IllegalArgumentException("String must be not null or empty");
		}
		return Integer.valueOf(str);
	}

}
