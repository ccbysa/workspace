package advanced06;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		List<String> ll = new ArrayList<String>();
		ll.add("Good");
		ll.add("bad");
		System.out.println(ll.get(0));
		System.out.println(ll.size());
		ll.add("shit");
		System.out.println(ll.size());
		ll.remove(1);
		System.out.println(ll.size());
	}
}
