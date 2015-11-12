package advanced01;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Demo {
	public static void main(String[] args) {
		String s = "Hello, world";
		String s1 = "hellll";
		String s2 = "   helll,    eddg.   ";
		
		System.out.println(s);
		System.out.println(s+". I'm coming.");
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.substring(0, 5));
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf("wo"));
		System.out.println(s.startsWith("hel"));
		System.out.println(s.endsWith("lad"));
		System.out.println(s.equals(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s2.trim());
		System.out.println(s2);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("world", "university"));
	}
}
