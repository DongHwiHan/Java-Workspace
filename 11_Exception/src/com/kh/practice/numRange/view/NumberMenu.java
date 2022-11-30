package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;

public class NumberMenu {

	public void menu() {
		NumberController nc = new NumberController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		boolean check = nc.checkDouble(num1, num2);
		
		System.out.println(num1 + "은(는) "+ num2+ "의 배수인가 ? " + check);
	}
}
