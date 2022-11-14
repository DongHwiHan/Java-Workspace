package com.kh.practice1.func;

import java.util.Scanner;

public class VariableParactice3 {

	public void test3() {

//		키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//		계산 공식 ) 면적 : 가로 * 세로
//		둘레 : (가로 + 세로) * 2

		Scanner sc = new Scanner(System.in);

		System.out.println("가로 : ");
		double i = sc.nextDouble();

		System.out.println("세로 : ");
		double e = sc.nextDouble();

		System.out.println("면적 : " + (i * e));

		System.out.println("둘레 : " + (i + e) * 2);
	}
}
