package hk.com.google.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * ²âÊÔÈİÆ÷
 * @author willard
 *
 */
public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add("abcd");
		list.add('a');
		list.add(123);
		list.add("ÖĞ¹úÈË");
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		System.out.println(list.subList(2, 4));
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		ArrayList list2 = new ArrayList();
		list2.add('a');
		list2.add('b');
		list2.add('c');
		System.out.println("list2 = " + list2);
		list.addAll(list2);
		System.out.println(list);
		list.remove(4);
		list.removeAll(list2);
		System.out.println(list);
		
	}
}
