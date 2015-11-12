package com.learn.java;

public class Human {
	private int height;
	
	public Human(int height) {
		// TODO Auto-generated constructor stub
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
	
	public void growHeight(int a) {
		height += a;
	}
}
