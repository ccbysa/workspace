package yliang01;

import javax.swing.JOptionPane;

public class WelcomeInMessageDialogBox {
	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, "Hello, world.!");
		JOptionPane.showConfirmDialog(null, "Hi, click again", "Please choose one action.", JOptionPane.INFORMATION_MESSAGE);
	}
}
