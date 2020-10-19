package com.model;

public class Meal {
	private int bred;
	private String rice;
	private int milk;

	public int getBred() {
		return bred;
	}

	public void setBred(int bred) {
		this.bred = bred;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	@Override
	public String toString() {
		return "Meal [bred=" + bred + ", rice=" + rice + ", milk=" + milk + "]";
	}

}
