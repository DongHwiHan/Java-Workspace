package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.println("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 " + (num2 % num1));
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("학년(숫자만) : ");
		int a = sc.nextInt();
		
		System.out.println("반(숫자만) : ");
		int b = sc.nextInt();
		
		System.out.println("번호(숫자만) : ");
		int c = sc.nextInt();
		
		System.out.println("성별(M/F) : ");
		String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        String result = ch == 'M' ? "남자" : "여자" ;
		
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double d = sc.nextDouble();
		
		System.out.println(a + "학년 " + b + "반 " + c + "번 " + name + " " + result + "의 성적은 " + d + "이다");
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int num = sc.nextInt();
		
		String result = (num <= 13 ? "어린이" : num <= 19   ? "청소년" : "성인");
		
		System.out.println(result);	
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int num2 = sc.nextInt();
		
		System.out.println("영어 : ");
		int num3 = sc.nextInt();
		
		System.out.println("수학 : ");
		int num4 = sc.nextInt();
		
		int result1 = num2 + num3 + num4;
		
		double result2 = result1 / 3;
		
		String result3 = (num2 >= 40) && (num3 >= 40) && (num4 >= 40) && (result2 >= 60) ? "합격" : "불합격";
		
		System.out.println("합계 : " + result1);
		
		System.out.println("평균 : " + result2);
		
		System.out.println(result3);		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(- 포함) : ");
//		char ch1 = sc.nextLine().charAt(7);
//		
//		String result4 = (ch1 == '1' ? "남자" : "여자");
//		
//		System.out.println(result4);
//		내가 푼것
		String resNo = sc.nextLine();
		char ch = resNo.charAt(7);
		
		String result = (ch == '1' || ch == '3') ? "남자" : "여자";
		
		System.out.println(result);
//		선생님이 푼것
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 >= num3) || (num2 < num3);	
		
		System.out.println(result);
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3);
		
		System.out.println(result);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.println("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.println("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double a = num1 + (num1*0.4); 
		double b = num2;
		double c = num3 + (num3*0.15);
		
		String result1 = a >= 3000 ? "3000 이상" : "3000 미만";
		String result2 = b >= 3000 ? "3000 이상" : "3000 미만";
		String result3 = c >= 3000 ? "3000 이상" : "3000 미만";
		
		
		System.out.println("A사원 연봉/연봉+a : "+ (int)num1 + "/"+ a);
		System.out.println(result1);
		System.out.println("B사원 연봉/연봉+a : "+ (int)num2 + "/"+ b);
		System.out.println(result2);
		System.out.println("C사원 연봉/연봉+a : "+ (int)num3 + "/"+ c);
		System.out.println(result3);
	}
}
