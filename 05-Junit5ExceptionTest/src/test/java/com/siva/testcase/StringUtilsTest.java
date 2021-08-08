package com.siva.testcase;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.siva.logic.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void testStringConvertToInt() {
		String str ="Siva";
		assertThrows(IllegalArgumentException.class, () -> StringUtils.stringconvertToInt(str));
	}

}
