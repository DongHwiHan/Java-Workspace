package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void test2() {

//		키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
//		ex.
//		첫 번째 정수 : 23
//		두 번째 정수 : 7

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수 : ");
		int first = sc.nextInt();

		System.out.println("두 번째 정수 : ");
		int two = sc.nextInt();

		System.out.println("더하기 결과 : " + (first + two));

		System.out.println("빼기 결과 : " + (first - two));

		System.out.println("곱하기 결과 : " + (first * two));

		System.out.println("나누기 결과 : " + (first / two));

	}
}
