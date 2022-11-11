package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("메뉴 번호를 입력하세요 :");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("입력 메뉴입니다.");break;
		case 2 : System.out.println("수정 메뉴입니다.");break;
		case 3 : System.out.println("조회 메뉴입니다.");break;
		case 4 : System.out.println("삭제 메뉴입니다.");break;
		case 7 : System.out.println("프로그램이 종료됩니다.");break;
		}		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다");
		}else if(num % 2 == 1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
			return;
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int num = sc.nextInt();
		
		System.out.println("수학점수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("영어점수 : ");
		int num3 = sc.nextInt();
		
		int num4 = num + num2 + num3;
		double num5 = (num4 / 3);
		
		
		if(num >= 40 && num2 >= 40 && num3 >= 40 && num5 >= 60 ) {
			System.out.println("국어 : "+num);
			System.out.println("수학 : "+num2);
			System.out.println("영어 : "+num3);
			System.out.println("합계 : "+num4);
			System.out.println("평균 : "+num5);
			System.out.println("축하합니다, 합격입니다!");		
		}else {
			System.out.println("불합격입니다.");
		}	
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 : ");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
		case 2 : 
		case 12 : System.out.println(num+"월은 겨울입니다."); break;	
		case 3 : 
		case 4 : 
		case 5 : System.out.println(num+"월은 봄입니다."); break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println(num+"월은 여름입니다."); break;
		case 9 : 
		case 10 : 
		case 11 : System.out.println(num+"월은 가을입니다."); break;
		default : System.out.println(num+"월은 잘못 입력된 달입니다."); break;
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String name = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String name1 = sc.nextLine();
		
		String id = "ddd";
		String pass = "lll";
		
		if(id.equals(name)) {
			if(pass.equals(name1)) {
				System.out.println("로그인 성공");
			}else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		
		String name = sc.nextLine();
		
		switch(name) {
		case "관리자" : System.out.print("회원관리, "); 
		case "회원" : System.out.print("게시글 관리, 게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.print("게시글 조회");
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해 주세요 : ");
		double num = sc.nextDouble();
		
		System.out.println("몸무게(kg)을 입력해 주세요 : ");
		double num2 = sc.nextDouble();
		
		double bmi = num2 / (num * num);
		
		System.out.println("BMI 지수 : "+bmi);
		
		if(bmi < 18.5){
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		
		
		double d;
		int c;
		
		if(num > 0 && num2 > 0) {
			
			System.out.println("연산자를 입력(+.-.*,/,%) : ");
			String name = sc.next();
			
			switch (name) {
			case "+" : 
				c = num + num2;
				System.out.println(num + " + " + num2 + " = " + c); break;
				
			case "-" : 
				c = num - num2;
				System.out.println(num + " - " + num2 + " = " + c); break;
				
			case "*" : 
				c = num * num2;
				System.out.println(num + " * " + num2 + " = " + c); break;
				
			case "/" : 
				d = (double)num / num2;
				System.out.println(num + " / " + num2 + " = " + String.format("%.6f", d)); break;
				
			case "%" : 
				c = num % num2;
				System.out.println(num + " % " + num2 + " = " + c); break;
				
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		}
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간 고사 점수 : ");
		int num = sc.nextInt();
		
		System.out.println("기말 고사 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("과제 점수 : ");
		int num3 = sc.nextInt();
		
		System.out.println("출석 회수 : ");
		int num4 = sc.nextInt();
		
		double a = ((num*20)/100);
		
		double b = ((num2*30)/100);
		
		double c = ((num3*30)/100);
		
		double d = ((num4*20)/20);
		
		double e = (a + b + c + d);
		
		System.out.println("============= 결과 =============");

		
		
		
		if(num4 > (20*30) / 100) {
			System.out.println("Fail [출석 회수 부족]"+ " " +"(" +num4 + "/ 20)");
		}else if(e < 70) {
			System.out.println("Fail");
		}else {
			System.out.println("중간 고사 점수(20) : "+a);
			System.out.println("기말 고사 점수(30) : "+b);
			System.out.println("과제 점수      (30) : "+c);
			System.out.println("출석 점수      (20) : "+d);
			System.out.println("총점 : "+e);
			System.out.println("PASS");
		}
	}
	
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요 : ");
        System.out.println("1.메뉴 출력");
        System.out.println("2.짝수/홀수");
        System.out.println("3.합격/불합격");
        System.out.println("4.계절");
        System.out.println("5.로그인");
        System.out.println("6.권한확인");
        System.out.println("7.BMI");
        System.out.println("8.계산기");
        System.out.println("9.P/F");
        System.out.println("선택 : ");
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		System.out.println("선택 : " + " (실습문제" +num+ " 실행)");
		
		if(num == 1 ) {
			practice1();
		}
		if(num == 2 ) {
			practice2();
		}
		if(num == 3 ) {
			practice3();
		}
		if(num == 4 ) {
			practice4();
		}
		if(num == 5 ) {
			practice5();
		}
		if(num == 6 ) {
			practice6();
		}
		if(num == 7 ) {
			practice7();
		}
		if(num == 8 ) {
			practice8();
		}
		if(num == 9 ) {
			practice9();
		}
		if(num == 10 ) {
			practice10();
		}	
	}
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비밀번호 입력(1000~9999) : ");
		
		String pw = sc.next();
		
		
		
		if(pw.length() !=  4 ) {
			System.out.println("자리수 안맞음");
		}else {
			int num1 = pw.charAt(0);
			int num2 = pw.charAt(1);
			int num3 = pw.charAt(2);
			int num4 = pw.charAt(3);
			
			if( num1 < 49 || num1 > 57 ) {
				System.out.println("제일 앞자리는 1~9사이의 수를 입력하세요.");
			}else if (num1 == num2) {
				System.out.println("중복값 있음");
			}else if (num1 == num3) {
				System.out.println("중복값 있음");
			}else if (num1 == num4) {
				System.out.println("중복값 있음");
			}else if (num2 == num3) {
				System.out.println("중복값 있음");
			}else if (num2 == num4) {
				System.out.println("중복값 있음");
			}else if (num3 == num4) {
				System.out.println("중복값 있음");
			}
			else {
				System.out.println("성공");
			}
		}	
	}
}
