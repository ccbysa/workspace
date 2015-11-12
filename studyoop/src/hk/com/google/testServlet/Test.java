package hk.com.google.testServlet;

public class Test {
	public static void main(String[] args) {
		HttpServlet s = new MyServlet();
		s.service();
	}
}
