package advanced08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class HelloWorld2 {
	private static void CreateAndShowGui() {
		JFrame frame = new JFrame("Hello, world.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(0, 2));
		
		JButton button = new JButton("OK");
		JButton lable = new JButton("Cancel");
		
		JPanel panel1 = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.setBackground(Color.red);
		
		panel1.add(button, BorderLayout.CENTER);
		cp.add(panel1);
		panel2.add(lable, BorderLayout.EAST);
		cp.add(panel2);
		
		String[] lines = {"a", "b", "c"};
		JList list = new JList(lines);
		cp.add(list);
		
		cp.add(new JCheckBox());
		
		frame.pack();
		frame.setVisible(true);		
	} 
	public static void main(String[] args) {
		Runnable tr = new Runnable() {
			public void run() {
				CreateAndShowGui();
			}
		};
		javax.swing.SwingUtilities.invokeLater(tr);
	}
}
