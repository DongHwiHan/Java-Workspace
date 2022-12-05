package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	Scanner sc = new Scanner(System.in);
	ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기"); // ➔ “프로그램을 종료합니다.” 출력 후 종료
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요");
			}
			// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		}
	}

	public void saveScore() {

	}

	public void readScore() {

	}
}
