package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {

		StringTokenizer strTokenizer = new StringTokenizer(str, " ");
		String afterStr = "";

//		방법1. String클래스를 이용.
//		while (strTokenizer.hasMoreTokens()) {
//			afterStr += strTokenizer.nextToken();
//		}
		
//		방법2. StringBuffer or StringBuilder를 이용.
		StringBuilder sb = new StringBuilder();
		
		while(strTokenizer.hasMoreTokens()) {
			sb.append(strTokenizer.nextToken());
		}
		return sb.toString();
	}

	public String firstCap(String input) {

		String firstToUpper = input.substring(0, 1).toUpperCase() + input.substring(1);
//		0이상 1미만의 인덱스범위를 짤라옴. 그후 대문자변환. 
		return firstToUpper; // 대문자로 반환한 문자 + 원래 문자
	}

	public int findChar(String input, char one) {
//		매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
//		방법 1. charAt 활용
//		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) == one) {
//				count++;
//			}
//		}
		
//		방법 2. toCharArray 활용
		char[] arr = input.toCharArray(); // apple -> {'a','p','p','l','e'}
		for(char c :arr) {
			if(c == one) {
				count++;
			}
		}
		return count;
	}
}
