package advanced09;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test {
	private static void createAndShouGUI() {
		JFrame frame = new JFrame("Hello, world!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new ButtonPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Runnable tr = new Runnable() {
			public void run() {
				createAndShouGUI();
			}
		};
		
		javax.swing.SwingUtilities.invokeLater(tr);
	}
}

class ButtonPanel extends JPanel {
	public ButtonPanel() {
		// TODO Auto-generated constructor stub
		JButton yellowButton = new JButton("yellow");
		JButton redButton = new JButton("red");
		
		this.add(yellowButton);
		this.add(redButton);
		
		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction redAction    = new ColorAction(Color.RED);
		
		yellowButton.addActionListener(yellowAction);
		redButton.addActionListener(redAction);
	}
	
	private class ColorAction implements ActionListener {
		private Color backgroundcolor;
		
		public ColorAction(Color c) {
			// TODO Auto-generated constructor stub
			backgroundcolor = c;
		}
		
		public void actionPerformed(ActionEvent event) {
			setBackground(backgroundcolor);
			repaint();
		} 
	}
}