package advanced06;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Set<Integer> t = new HashSet<>();
		t.add(5);
		t.add(5);
		t.add(3);
		t.add(2);
		System.out.println(t);
		t.remove(5);
		System.out.println(t);
	}
}
