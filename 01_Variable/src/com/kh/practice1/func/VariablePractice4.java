package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public void test4() {

//		영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
//		ex.
//		문자열을 입력하세요 : apple

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String name = sc.nextLine();
		String name2 = "apple";

		System.out.print("첫 번째 정수 : " + name.charAt(0));

		System.out.println();

		System.out.print("두 번째 정수 : " + name.charAt(1));

		System.out.println();

		System.out.print("세 번째 정수 : " + name.charAt(2));

	}
}
