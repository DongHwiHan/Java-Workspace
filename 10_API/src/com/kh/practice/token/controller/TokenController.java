package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {

		StringTokenizer strTokenizer = new StringTokenizer(str, " ");
		String afterStr = "";

		while (strTokenizer.hasMoreTokens()) {
			afterStr += strTokenizer.nextToken();
		}
		return afterStr;
	}

	public String firstCap(String input) {

		String firstToUpper = input.substring(0, 1).toUpperCase() + input.substring(1);
		return firstToUpper;
	}

	public int findChar(String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
}
