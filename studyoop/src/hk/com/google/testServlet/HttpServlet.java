package hk.com.google.testServlet;

public class HttpServlet {
	public void service(){
		System.out.println("HttpServlet.test1()");
		doGet();//��ʽ��this��ָ������
	}
	public void doGet(){
		System.out.println("HttpServlet.doGet()");
	}
}
