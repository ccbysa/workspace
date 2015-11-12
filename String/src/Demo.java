import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String name = "小明";
		System.out.println(name.charAt(1));
		System.out.println(name.contains("明"));
		System.out.println(name.contains("l"));
		System.out.println(name.replace("明", "mingzi名字的名"));
		
		int age = 17;
		float score = 97.5f;
		
		String all = name + "的年龄是：" + age + ", 成绩是："+score;
		System.out.println(all);
		
		String a = "hello,";
		a += "world.";
		System.out.println(a);
		String hostname = "www.google.com.hk";
		String array[] = hostname.split("[.]");
		System.out.println(Arrays.toString(array));
		System.out.println(hostname.split("\\.")[2]);
		
	}
}
