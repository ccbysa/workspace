package hk.com.google.InnerClass;

import hk.com.google.InnerClass.Face.Noze;

public class Outer {
	public static void main(String[] args) {
		Noze aNoze = (new Face()).new Noze();
		aNoze.type = "����һֻ����";
		System.out.println(aNoze.type);
		System.out.println("hello, world");
		System.out.println("����������������������������������˵�еķָ���������������������������");
		Face aFace = new Face();
		aFace.type = 123;
		Noze aNoze2 = aFace.new Noze();
		aNoze2.type = "������һֻ����";
		System.out.println(aNoze2.type);
		aNoze2.breath();
		System.out.println("����������������������������������˵�еķָ���������������������������");
		Face.Ear aEar = new Face.Ear();
		aEar.listen();
	}
}

class Face{
	int type;
	int size = 5;
	
	class Noze{
		String type;
		//static int b;//�ڲ��಻����static����
		//static void print(){}//�ڲ��಻����static����
		void breath(){
			System.out.println("come in breath()");
			System.out.println(type);//����������ڲ����type
			System.out.println(this.type);//����������ڲ����type
			System.out.println("Face.Noze.breath()");
			System.out.println(Face.this.type);//�ⲿ���type
			System.out.println(size);//û������������ⲿ��size,
			System.out.println("����");
		}
	}
	static class Ear{
		void listen(){
			System.out.println("Face.Ear.listen()");
			System.out.println("������");
		}
	}
}