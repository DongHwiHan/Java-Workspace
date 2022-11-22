package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);

	private TriangleController tc = new TriangleController();

	private SquareController scr = new SquareController();

	public void inputMenu() {

		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch (menuNum) {
		case 3:
			triangleMenu();
			break;
		case 4:
			squareMenu();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		}
	}

	public void triangleMenu() {
		System.out.println("==== 삼각형 ====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		inputSize(3, menuNum);
	}

	public void squareMenu() {
		System.out.println("==== 사각형 ====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		inputSize(4, menuNum);

	}

	public void inputSize(int type, int menuNum) {

		if (type == 3) {

			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("너비 : ");
				double width = sc.nextInt();
				System.out.println("삼각형 둘레 : " + tc.calcArea(height, width));
				triangleMenu();

			} else if (menuNum == 2) {
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				triangleMenu();

			} else if (menuNum == 3) {
				printInformation(3);
				triangleMenu();
			} else {
				inputMenu();
			}
		}

		if (type == 4) {

			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("너비 : ");
				double width = sc.nextInt();
				System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
				squareMenu();
			} else if (menuNum == 2) {
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("너비 : ");
				double width = sc.nextInt();
				System.out.println("사각형 면적 : " + scr.calcArea(height, width));
				squareMenu();

			} else if (menuNum == 3) {
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				squareMenu();

			} else if (menuNum == 4) {
				printInformation(3);
				squareMenu();

			} else {
				inputMenu();
			}
		}

	}

	public void printInformation(int type) {

		if (type == 3) {
			System.out.print(tc.print());
			System.out.println();
		} else {
			System.out.print(scr.print());
			System.out.println();
		}
	}
}
