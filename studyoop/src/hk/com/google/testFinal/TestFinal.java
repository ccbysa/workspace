package hk.com.google.testFinal;

/**
 * ����Final����
 * @author willard
 * @version 1.0
 */
public class TestFinal {
	public static void main(String[] args) {
		final  int MAX_VALUE = 200;
		//MAX_VALUE = 300;
		//The final local variable MAX_VALUE cannot be assigned. 
		//It must be blank and not using a compound assignment
		double d = Math.PI;
		
	}
	
}

//final class Animal{//final ���ε��࣬���ܱ��̳�
class Animal{
	String color;
	double d = Math.PI;
	
	//public final void run(){ //�÷������ܱ���д override
	public void run(){
		System.out.println("Animal.run()");
		System.out.println("����");
	}
	
}

class Bird extends Animal{
	public void run(){
		super.run();
		System.out.println("Bird.run()");
		System.out.println("���ڷ�");
	}
		
}