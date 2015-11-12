package liang02;

import javax.swing.JOptionPane;

public class Demo {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "这个一个计算工资的小程序");
		String name = JOptionPane.showInputDialog("请输入您的名字：");
		String time = JOptionPane.showInputDialog("请输入您的每周工作时间：");
		double timeOfWeek = Double.parseDouble(time);
		time = JOptionPane.showInputDialog("请输入您的每小时工资：");
		double payOfHour = Double.parseDouble(time);
		time = JOptionPane.showInputDialog("请输入联邦所得税率：");
		double fedTaxRate = Double.parseDouble(time);
		time = JOptionPane.showInputDialog("请输入州所得税率：");
		double stateTaxRate = Double.parseDouble(time);
		double grossPay = payOfHour*timeOfWeek;
		double fedTax = (int)(grossPay*fedTaxRate*100)/100.0;
		double stateTax = (int)(grossPay*stateTaxRate*100)/100.0;
		double totalTax =  fedTax + stateTax;
		double netPay = (int)(grossPay*(1-fedTaxRate-stateTaxRate)*100)/100.0;
		
		JOptionPane.showMessageDialog(null, "Eployee's name: "+name
				+"\nHours worked: "+timeOfWeek
				+"\nPay rate: "+payOfHour
				+"\nGross pay: "+grossPay
				+"\nDeductions:"
				+"\n  Fed tax: "+fedTax
				+"\n  State tax: "+stateTax
				+"\n  Total tax: "+totalTax
				+"\nNet pay: " + netPay);
	}
}
