package com.kh.example.practice3.model.vo;

public class Circle {

	private static final double PI = 3.14;
	private int radius = 1;

	public Circle() {
		getAreaOfCircle();
		getSizeOfCircle();
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int radius() {
		return radius;
	}

	public void incrementRadius() {
		radius++;
		
	}

	public void getAreaOfCircle() {
		System.out.println(PI * radius * radius);
	}

	public void getSizeOfCircle() {
		System.out.println(radius * 2 * PI);
	}
}
