package advanced08;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorld {
	private static void creatAndShowGUI() {
		JFrame frame = new JFrame("Hello, world.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		JButton j3 = new JButton("three");
		cp.add(j1);
		cp.add(j2);
		cp.add(j3);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Runnable tr = new Runnable() {
			public void run() {
				creatAndShowGUI();
			}		
		};
		javax.swing.SwingUtilities.invokeLater(tr);	
	}
}
