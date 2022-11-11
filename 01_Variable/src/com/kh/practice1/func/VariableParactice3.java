package com.kh.practice1.func;

import java.util.Scanner;

public class VariableParactice3 {

	public void test5() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("가로 : " );
			double i = sc.nextDouble();
			
			System.out.println("세로 : " );
			double e = sc.nextDouble();
			
			System.out.println("면적 : " + (i*e) );
			
			
			System.out.println("둘레 : " + (i+e)*2 );
	}
}
