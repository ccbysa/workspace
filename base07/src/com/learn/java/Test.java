package com.learn.java;

public class Test {
	public static void main(String[] args) {
		Human h1 = new Human(57);
		System.out.println(h1.getHeight());
		h1.growHeight(20);
		System.out.println(h1.getHeight());
	}
}
