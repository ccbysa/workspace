package liang03;

import javax.swing.JOptionPane;

public class Demo_practice_39 {
	public static void main(String[] args) {
		String isbn = JOptionPane.showInputDialog("请输入 ISBN 的前9位数");
		int number = Integer.parseInt(isbn);
		int b1 = number/100000000;
		int b2 = number/10000000%10;
		int b3 = number/1000000%10;
		int b4 = number/100000%10;
		int b5 = number/10000%10;
		int b6 = number/1000%10;
		int b7 = number/100%10;
		int b8 = number/10%10;
		int b9 = number%10;
		int b10 = (b1*1+b2*2+b3*3+b4*4+b5*5+b6*6+b7*7+b8*8+b9*9)%11;
		
		JOptionPane.showMessageDialog(null, "您的ISBN："+b1+b2+b3+b4+b5
				+b6+b7+b8+b9+b10);
		
	}
}
