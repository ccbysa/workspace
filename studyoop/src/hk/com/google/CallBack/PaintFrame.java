package hk.com.google.CallBack;

public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("PaintFrame.drawFrame()");
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("������Ϣջ");
		f.paint();
		System.out.println("��������");
		System.out.println("����Ч��");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame());
		System.out.println("***************");
		drawFrame(new Cirtle());
	}
}

//class GameFrame implements IMyFrame{
class GameFrame extends IMyFrame{
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("GameFrame.paint()");
		System.out.println("Game over");
	}
	
}
//class Cirtle implements IMyFrame{
class Cirtle extends IMyFrame{

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Cirtle.paint()");
		System.out.println("Cir");
	}
	
}