package liang03;

import javax.swing.JOptionPane;

public class Demo3_4 {
	public static void main(String[] args) {
		int a = (int)(System.currentTimeMillis()%10);
		int b = (int)(Math.random()*10);
		
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		
		String aString = JOptionPane.showInputDialog("请输入 "+ a+ " - "+b+" 的值" );
		int c = Integer.parseInt(aString);
		if (c == (a-b)) {
			JOptionPane.showMessageDialog(null, "恭喜你，答对了！");
		}
		else {
			JOptionPane.showMessageDialog(null, "很遗憾，你错了..."
					+"\n"+a+" - "+b+" = "+(a-b));
		}
	}
}
