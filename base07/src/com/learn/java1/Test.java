package com.learn.java1;
import com.learn.java.Human;

public class Test {
	public static void main(String[] args) {
		Human h2 = new Human(80);
		System.out.println(h2.getHeight());
		h2.growHeight(30);
		System.out.println(h2.getHeight());
	}
}
