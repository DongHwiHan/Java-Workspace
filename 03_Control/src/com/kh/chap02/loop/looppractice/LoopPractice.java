package com.kh.chap02.loop.looppractice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
		//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.println();
			practice1();
		}

		for (int i = 1; i <= num; i++) {
			if (num >= 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void practice2() {

		//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
		//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.println();
			practice2();
		}

		for (int i = num; i >= 1; i--) {
			if (num >= 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void practice3() {

		//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		//		ex.
		//		정수를 하나 입력하세요 : 8
		//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i == num) {
				System.out.print(i + " = ");
			} else {
				System.out.print(i + " + ");
			}
			sum += i;
		}
		System.out.println(sum);
	}

	public void practice4() {

		//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
		//		력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		//		 첫 번째 숫자 : 8  첫 번째 숫자 : 4  첫 번째 숫자 : 9
		//		 두 번째 숫자 : 4  두 번째 숫자 : 8  두 번째 숫자 : 0
		//		 4 5 6 7 8      4 5 6 7 8     1이상의 숫자를 입력해주세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.println();
			practice4();
		}
		if (num > num2) {
			for (int i = num2; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void practice5() {

		//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
		//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9 이하의 숫자를 입력해주세요.");
			System.out.println();
			practice5();
		}

		for (int i = num; i <= 9; i++) {
			if (num <= 9) {
				System.out.println("====" + i + "단" + "====");
				System.out.println();
			}
		}
	}

	public void practice6() {

		//		사용자로부터 시작 숫자와 공차를 입력 받아
		//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		//		단, 출력되는 숫자는 총 10개입니다.
		//		시작 숫자 : 4
		//		공차 : 3
		//		4 7 10 13 16 19 22 25 28 31

		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자 : ");
		int num = sc.nextInt();

		System.out.println("공차 : ");
		int num2 = sc.nextInt();

		int sum = num;
		System.out.print(num + " ");
		for (int i = 1; i <= 9; i++) {
			sum += num2;
			System.out.print(sum + " ");
		}
	}

	public void practice7() {

		//		정수 입력 : 4
		//		*
		//		**
		//		***
		//		****

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j <= i)
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice8() {

		//		정수 입력 : 4
		//		****
		//		***
		//		**
		//		*

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {

		//		정수 입력 : 4
		//		   *
		//		  **
		//		 ***
		//		****

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {

			for (int j = 0; j <= num; j++) {

				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void practice10() {

		//		정수 입력 : 4
		//		****
		//		 ***
		//		  **
		//		   *

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = num; j > 0; j--) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void practice11() {

		//		정수 입력 : 4
		//		   *
		//		  ***
		//		 *****
		//		*******

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - (1 + i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {

		//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		//		숫자 : 5 숫자 : 9 숫자 : 0
		//		소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");

		int num = sc.nextInt();

		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {

				isPrime = false;

				break;
			}
		}
		System.out.printf(isPrime ? "소수입니다." : "소수가 아닙니다.");
	}

	public void practice13() {

		//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		//		숫자 : 11
		//		2 3 5 7 11
		//		2부터 11까지 소수의 개수는 5개입니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");

		int num = sc.nextInt();
		int sosu = 0;

		if (num < 2) {
			System.out.println("잘못입력하셨습니다.");
		} else {

			for (int i = 1; i <= num; i++) {
				int c = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						c += 1;
					}
				}
				if (c == 2) {
					sosu += 1;
					System.out.print(i + " ");
				}
			}
			System.out.println();
			System.out.println("2부터 11까지 소수의 개수는 " + sosu + "개 입니다.");
		}
	}

	public void practice14() {

		//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		//		숫자 : 11
		//		2 3 5 7 11
		//		2부터 11까지 소수의 개수는 5개입니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 하나를 입력하세요 : ");

		int num = sc.nextInt();
		int g = 0;

		for (int i = 2; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				g += 1;
			}
		}
		System.out.println();
		System.out.println("count : " + g);
	}

	public void practice15() {

		//		정수 입력 : 3
		//		*
		//		**
		//		***
		//		**
		//		*

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i >= j)
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - 1; j++) {
				if (i <= j)
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice16() {

		//		정수 입력 : 5
		//		*****
		//		* 	*
		//		* 	*
		//		* 	*
		//		*****
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int square = sc.nextInt();
		for (int i = 1; i <= square; i++) {
			if (i == 1 || i == square) {
				for (int j = 0; j < square; j++) {
					System.out.print('*');
				}
				System.out.println();

			} else {
				for (int j = 1; j <= square; j++) {
					if (j == 1 || j == square) {
						System.out.print('*');
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

	public void practice17() {

		//		정수 입력 : 4
		//		*
		//	   ***
		//	  *****
		//	 *******
		//	  *****
		//	   ***
		//		*
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - (1 + i); j++) { // 0 1
				System.out.print(" "); // ;
			}
			for (int j = 0; j < 1 + 2 * i; j++) { // 0
				System.out.print("*");// *
			}
			System.out.println();
		}
		for (int i = 0; i < num - 1; i++) { // 0 1 2 ...

			for (int j = 0; j < 1 + i; j++) { // 0
				System.out.print(" "); // ;
			}
			for (int j = 0; j < (num - i) * 2 - 3; j++) { // 1+2*(num -2 - i) -> 1 -> 0
				//			  1 + 2num - 4 -2ㅑ -> 2(num)
				System.out.print("*");// *****
			}
			System.out.println();
		}
	}

	public void practice18() {

		//		정수 입력 : 4
		//		*
		//	   * *
		//	  *   *
		//	 *     *
		//	  *   *
		//	   * *
		//		*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				if (j == 0 || j == 2 * i) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i < star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (star - i) - 1; j++) {
				if (j == 0 || j == 2 * (star - i) - 2) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	// public void practice19() {
	//
	// Scanner sc = new Scanner(System.in);
	// System.out.println("숫자:");
	// int num = sc.nextInt();
	// int count = 0;
	//
	// if (num < 2) {
	// System.out.println("잘못입력하셨습니다.");
	// } else {
	//
	// for (int i = 1; i <= num; i++) {
	// if (num % i == 0) {
	// count += 1;
	// }
	// }
	// if (count == 2) {
	// System.out.println("소수입니다.");
	// } else {
	// System.out.println("소수가 아닙니다.");
	// }
	// }
	// }
}
