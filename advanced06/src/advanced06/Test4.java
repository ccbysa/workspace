package advanced06;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<>();
		ll.add(4);
		ll.add(5);
		ll.add(6);
		Iterator i = ll.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}
