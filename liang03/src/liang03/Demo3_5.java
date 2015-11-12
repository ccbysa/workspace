package liang03;

import javax.swing.JOptionPane;

public class Demo3_5 {
	public static void main(String[] args) {
		int tax1=0, tax2=0, tax3=0,tax4=0,tax5=0;
		double tax = 0.0;
		String tax_Type = JOptionPane.showInputDialog("请输入纳税人类别（）0-3：");
		
		int taxType = Integer.parseInt(tax_Type);
		if (taxType > 3) {
			JOptionPane.showMessageDialog(null, "纳税人类别输入错误!", "系统出错", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		if (taxType == 0) {
			System.out.println("taxtype = 0");
			tax1 = 372950;
			tax2 = 171550;
			tax3 = 82250;
			tax4 = 33950;
			tax5 = 8350;
		}
		if (taxType == 1) {
			tax1 = 372950;
			tax2 = 208850;
			tax3 = 137050;
			tax4 = 67900;
			tax5 = 16700;
		}
		if (taxType == 2) {
			tax1 = 186475;
			tax2 = 104425;
			tax3 = 68525;
			tax4 = 33950;
			tax5 = 8350;
		}
		if (taxType == 3) {
			tax1 = 372950;
			tax2 = 190200;
			tax3 = 117450;
			tax4 = 45500;
			tax5 = 11950;
		}
		
		String payment = JOptionPane.showInputDialog("请输入您的工资：");
		double pay = Double.parseDouble(payment);
		System.out.println("pay = "+pay);
		System.out.println(tax5);
		System.out.println(tax4);
		System.out.println(tax3);
		System.out.println(tax2);
		System.out.println(tax1);
		if (pay < 0) {
			JOptionPane.showMessageDialog(null, "收入输入错误", "系统出错", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		else if (pay > tax1) {
			tax = tax5*10/100 + (tax4-tax5)*15/100 + (tax3-tax4)*25/100 + (tax2-tax3)*28/100 + (tax1-tax2)*33/100 + (pay-tax1)*35/100;
		}
		else if (pay > tax2) {
			tax = tax5*10/100 + (tax4-tax5)*15/100 + (tax3-tax4)*25/100 + (tax2-tax3)*28/100 + (pay-tax2)*33/100;
		}
		else if (pay > tax3) {
			tax = tax5*10/100 + (tax4-tax5)*15/100 + (tax3-tax4)*25/100 + (pay-tax3)*28/100;
		}
		else if (pay > tax4) {
			System.out.println("44444");
			tax = tax5*10/100 + (tax4-tax5)*15/100 + (pay-tax4)*25/100;
		}
		else if (pay > tax5) {
			System.out.println("55555");
			tax = tax5*10/100 + (pay-tax5)*15/100;
		}
		else {
			tax = pay*10/100;
			System.out.println("tax = "+tax);
		}
		
		JOptionPane.showMessageDialog(null, "您应纳税 "+tax+" $");
		
		
	}
}
