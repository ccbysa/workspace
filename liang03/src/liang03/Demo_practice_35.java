package liang03;

import javax.swing.JOptionPane;

public class Demo_practice_35 {
	public static void main(String[] args) {
		long milliSecond = System.currentTimeMillis();
		int firstNum = (int)(milliSecond%1000)/100;
		int secondNum = (int)(milliSecond%1000)%100/10;
		int thirdNum = (int)(milliSecond%1000)%10;
		
		String input = JOptionPane.showInputDialog("请输入 "+firstNum
				+" + "+secondNum
				+" + "+thirdNum+"的值：");
		if (Integer.parseInt(input) == (firstNum+secondNum+thirdNum)) {
			JOptionPane.showMessageDialog(null, "恭喜你，答对了");
		}
		else {
			JOptionPane.showMessageDialog(null, "很遗憾，答错了");
		}
	}
	
}
