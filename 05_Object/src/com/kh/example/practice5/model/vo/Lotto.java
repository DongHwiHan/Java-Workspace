package com.kh.example.practice5.model.vo;

public class Lotto {

	private int lotto;
	private int[] arr;
	{
		arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}
	}

	public Lotto() {

	}

	public int getLotto() {
		return lotto;
	}

	public void setLotto(int lotto) {
		this.lotto = lotto;
	}

	public void information() {
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
