package com.kh.chap01_beforeVsafter.before.model.vo;

public class SmartPhone {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String moblieAgenct;

	public SmartPhone() {

	}

	public SmartPhone(String brand, String pCode, String pName, int price, String moblieAgenct) {

		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.moblieAgenct = moblieAgenct;
	}

	public String getBrand() {
		return brand;
	}

	public String getpCode() {
		return pCode;
	}

	public String getpName() {
		return pName;
	}

	public int getPrice() {
		return price;
	}

	public String getMoblieAgenct() {
		return moblieAgenct;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setMoblieAgenct(String moblieAgenct) {
		this.moblieAgenct = moblieAgenct;
	}

	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", " + moblieAgenct;
	}

}
