package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	public void CastingPractice() {

//		실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
//		이 때 총점과 평균은 정수형으로 처리하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("국어 : ");
		double a = sc.nextDouble();

		System.out.println("영어 : ");
		double b = sc.nextDouble();

		System.out.println("수학 : ");
		double c = sc.nextDouble();

		int sum = (int) (a + b + c);
		int avg = sum / 3;

		System.out.println("총점 : " + (int) (a + b + c));

		System.out.printf("평균 : %d \n", avg);
	}

}
