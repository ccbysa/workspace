package hk.com.google.testServlet;

public class HttpServlet {
	public void service(){
		System.out.println("HttpServlet.test1()");
		doGet();//隐式的this是指向对象的
	}
	public void doGet(){
		System.out.println("HttpServlet.doGet()");
	}
}
