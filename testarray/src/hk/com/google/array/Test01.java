package hk.com.google.array;
/**
 * 测试数组
 * @author willard
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int a[];//数组的2种声明方法
		char b[];
		b = new char[2];
		b[0] = 'a'; b[1] = 'b';
		int c[] = {11, 22, 334, 44};//静态初始化
		
		a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = i+10;//初始化
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		System.out.println("+++++++++++++++++++++");
		Car[] cars = new Car[2];
		cars[0] = new Car("奔驰");
		cars[1] = new Car("宝马");
		System.out.println(cars[1].name);
		
		System.out.println(cars.length);
		System.out.println("+++++++++++++++++++++");
		Car ccaCar[] = {
						new Car("奥迪"),
						new Car("奥拓"),
						new Car("比亚迪")
						};
		for (int i = 0; i < ccaCar.length; i++) {
			System.out.println(ccaCar[i].name);
		}
				
	}
}
