package hk.com.google.testEncapsulation02;
/**
 * ���Է�װ������ڶ�����
 * @author willard
 * @version 1.0
 */
public class TestSecond {
	private int a = 5;
	int b = 6;
	protected int c = 7;
	public int d = 8;
	private boolean big;
	
	
	
	
	public boolean isBig() {
		return big;
	}
	public void setBig(boolean big) {
		this.big = big;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	private void Print1(int x) {
		a = x; b =x; c = x; d = x;//ͬһ�����ж��ǿɼ���
		System.out.println("���ǵڶ������ĵ�һ���ļ�");
		System.out.println("�ҵ�������private");
	}
	void Print2(int x){
		a = x; b =x; c = x; d = x;
		System.out.println("TestSecond.Pring2()");
		System.out.println("�ҵ�������Ĭ�ϵģ�default");
	}
	protected void Print3(int x)	{
		a = x; b =x; c = x; d = x;
		System.out.println("TestSecond.Print3()");
		System.out.println("�ҵ�������protected");
	}
	public void Print4(int x) {
		a = x; b =x; c = x; d = x;
		System.out.println("TestSecond.Print4()");
		System.out.println("�ҵ�������public");
	}
}
 
//public class Test2 {//ÿ���ļ�ֻ����һ��public ��
class Test2{
	TestSecond t = new TestSecond();
	int b;
	
	public void setA(){
		//t.a = 5;//��ͬ�����в��ɼ�
		t.b = 6;
		t.c = 7;
		t.d = 8;
		
	}
}
