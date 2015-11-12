package hk.com.google.InnerClass;

import hk.com.google.InnerClass.Face.Noze;

public class Outer {
	public static void main(String[] args) {
		Noze aNoze = (new Face()).new Noze();
		aNoze.type = "我是一只鼻子";
		System.out.println(aNoze.type);
		System.out.println("hello, world");
		System.out.println("××××××××××××××××传说中的分隔符××××××××××××");
		Face aFace = new Face();
		aFace.type = 123;
		Noze aNoze2 = aFace.new Noze();
		aNoze2.type = "我是另一只鼻子";
		System.out.println(aNoze2.type);
		aNoze2.breath();
		System.out.println("××××××××××××××××传说中的分隔符××××××××××××");
		Face.Ear aEar = new Face.Ear();
		aEar.listen();
	}
}

class Face{
	int type;
	int size = 5;
	
	class Noze{
		String type;
		//static int b;//内部类不能有static属性
		//static void print(){}//内部类不能有static方法
		void breath(){
			System.out.println("come in breath()");
			System.out.println(type);//重名情况：内部类的type
			System.out.println(this.type);//重名情况：内部类的type
			System.out.println("Face.Noze.breath()");
			System.out.println(Face.this.type);//外部类的type
			System.out.println(size);//没有重名情况，外部的size,
			System.out.println("呼吸");
		}
	}
	static class Ear{
		void listen(){
			System.out.println("Face.Ear.listen()");
			System.out.println("我在听");
		}
	}
}