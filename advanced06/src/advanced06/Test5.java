package advanced06;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("xiaoming", 123);
		m1.put("Lilei", 23);
		m1.put("lucy", 56);
		
		System.out.println(m1.get("Lilei"));
	}
}
