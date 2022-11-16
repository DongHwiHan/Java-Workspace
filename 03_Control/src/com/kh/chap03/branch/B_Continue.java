package com.kh.chap03.branch;

public class B_Continue {

	// continue; : 반복문 안에서 사용하는 구문
	// continue를 만나게 되면 그 뒤에 어떤코드가 있든간에 실행하지 않고
	// 가장 가까운 반복문으로 올라감.
	//
	public void method1() {
		// 1부터 10까지 홀수만 출력
		// 1 3 5 7 9

		// 방법 1
		for (int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 방법 2
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 방법 3
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) { // 짝수일 경우
				continue; // 뒷쪽의 내용의 코드는 무시하고 다음 증감식으로 넘어감.
			}
			System.out.print(i + " ");
		}
	}

	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 더해보기.
		// continue문을 활용해서 코드를 작성
		// "총합계 : xx
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("총합계 : " + sum);
	}

	public void method3() {
		// 2단 ~ 9단까지 출력을 하되
		// 단, 4의 배수단은 빼고 출력(continue문 사용)
		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 4 == 0) {
				continue;
			}
			for (int j = 1; j <= 9; j++) {
				System.out.println(dan + " X " + j + " = " + (dan * j));
			}
			System.out.println("=======");
		}
	}
}
