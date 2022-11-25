package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {

	public boolean coupon;

	public CookBook() {
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [coupon=" + (coupon ? true : false) + ", toString()=" + super.toString() + "]";
	}

}
