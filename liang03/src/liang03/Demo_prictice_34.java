package liang03;

import javax.swing.JOptionPane;

public class Demo_prictice_34 {
	public static void main(String[] args) {
		int firstNum = (int)(System.currentTimeMillis()%100);
		int secondNum = (int)(Math.random()*100);
		
		String input = JOptionPane.showInputDialog("请输入 "+firstNum+" 和 "+secondNum+" 的和：" );
		int sum = Integer.parseInt(input);
		if (sum == (firstNum+secondNum)) {
			JOptionPane.showMessageDialog(null, "恭喜你，答对了");
		}
		else {
			JOptionPane.showMessageDialog(null, "很遗憾，你错了");
		}
	}
}
