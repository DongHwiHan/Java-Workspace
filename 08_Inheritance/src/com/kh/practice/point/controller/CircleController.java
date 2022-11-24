package com.kh.practice.point.controller;

import javax.sql.rowset.serial.SQLOutputImpl;

import com.kh.practice.point.model.vo.Circle;

import jdk.swing.interop.SwingInterOpUtils;

public class CircleController {

	private static final double PI = 3.141592653589793;

	Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "면적 :  " + x + ", " + y + ", " + radius + " / " + (PI * radius * radius);
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "둘레 : " + x + ", " + y + ", " + radius + " / " + (PI * radius * 2);
	}
}
