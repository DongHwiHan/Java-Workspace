package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book b = new Book();
		b.infor();
		
		Book b2 = new Book("나나나나나나", "나무", "동동이");
		b2.infor();
		
		Book b3 = new Book("나나나나나나나", "나무", "동동이", 150000, 0.0);
		b3.infor();
	}

}
