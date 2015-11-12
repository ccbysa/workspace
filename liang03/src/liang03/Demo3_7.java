package liang03;

import javax.swing.JOptionPane;

public class Demo3_7 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("请输入一个整数： ");
		int number = Integer.parseInt(input);
		
		if ((number%3 == 0) && (number%2 == 0)) {
			//System.out.println(number+" 能被2和3整数");
			JOptionPane.showMessageDialog(null, number+" 能被 2 和 3 整数");
		}
		if ((number%3 == 0) ^ (number%2 == 0)) {
			//System.out.println(number+" 能被2或者3整除");
			JOptionPane.showMessageDialog(null, number+" 能被 2 或者 3 整除");
			if ((number%3 == 0) && (number%2 != 0)) {
				//System.out.println(number+" 只能被3整数");
				JOptionPane.showMessageDialog(null, number+" 只能被 3 整除");
			}
			if ((number%3 != 0) && (number%2 == 0)) {
				//System.out.println(number+" 只能被2整数");
				JOptionPane.showMessageDialog(null, number+" 只能被 2 整除");
			}
		}
		if ((number%3 != 0) && (number%2 != 0)) {
			//System.out.println(number+" 不能被2和3整数");
			JOptionPane.showMessageDialog(null, number+" 不能被 2 和 3 整除");
		}
	}
}
