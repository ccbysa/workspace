package liang03;

import javax.swing.JOptionPane;

public class Demo3_3 {
	public static void main(String[] args) {
		int a=0,b=0,c=0,d=0,e=0;
		int oneSet = JOptionPane.showConfirmDialog(null, "生日在第一个集合么？","选择1", JOptionPane.YES_NO_OPTION);
		if (oneSet == 0) {
			a = 1;
		}
		oneSet = JOptionPane.showConfirmDialog(null, "生日在第二个集合么？","选择1", JOptionPane.YES_NO_OPTION);
		if (oneSet == 0) {
			b = 2;
		}
		oneSet = JOptionPane.showConfirmDialog(null, "生日在第三个集合么？","选择1", JOptionPane.YES_NO_OPTION);
		if (oneSet == 0) {
			c = 4;
		}
		oneSet = JOptionPane.showConfirmDialog(null, "生日在第四个集合么？","选择1", JOptionPane.YES_NO_OPTION);
		if (oneSet == 0) {
			d = 8;
		}
		oneSet = JOptionPane.showConfirmDialog(null, "生日在第五个集合么？","选择1", JOptionPane.YES_NO_OPTION);
		if (oneSet == 0) {
			e = 16;
		}
		
		JOptionPane.showMessageDialog(null, "a = " + a
				+"\nb = " + b
				+"\nc = " + c
				+"\nd = " + d
				+"\ne = " + e
				+"\n你的生日是： "+(a+b+c+d+e));
	}
}
