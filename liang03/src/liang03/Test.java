package liang03;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "你是一个机器人吗？");
		int a = (int)(System.currentTimeMillis()%10);
		int b = (int)(Math.random()*10);
		int c = (int)(System.currentTimeMillis()*7%10);
		String input = JOptionPane.showInputDialog("TimeMill = "+ System.currentTimeMillis()
				+"\nMillis()*7 = " + System.currentTimeMillis()*7
				+"\n请输入 "+a+" + "+ c+" 的值");
		int inputInt = Integer.parseInt(input);
		if (inputInt == (a+c)) {
			JOptionPane.showMessageDialog(null, "恭喜你，你太厉害了");
		}
		else {
			JOptionPane.showMessageDialog(null, "很遗憾，你错了");
		}
	}
}
