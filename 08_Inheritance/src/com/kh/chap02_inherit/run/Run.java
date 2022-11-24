package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {

	public static void main(String[] args) {

		Airplane a = new Airplane("대한민국호", 0.02, "여객기", 16, 2);

		Car c = new Car("폭스바겐", 12.01, "자동차", 4);

		Ship s = new Ship("새마을호", 6.5, "배", 8);

		System.out.println(a.information());
		System.out.println(c.information());
		System.out.println(s.information());

		a.howToMove();
		c.howToMove();
		s.howToMove();
	}

}
