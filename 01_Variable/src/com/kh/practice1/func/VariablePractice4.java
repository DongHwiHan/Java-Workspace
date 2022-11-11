package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
public void test6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : " );
		String name = sc.nextLine();
		String name2 = "apple";
		
		System.out.print("첫 번째 정수 : " + name.charAt(0));
		
		System.out.println();
		
		System.out.print("두 번째 정수 : " + name.charAt(1) );
		
		System.out.println();
		
		System.out.print("세 번째 정수 : " + name.charAt(2) );
		
	}
}
