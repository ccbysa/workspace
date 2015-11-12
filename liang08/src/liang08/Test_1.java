package liang08;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test_1 {
  public static void main(String[] args) {
    RecTangle r1 = new RecTangle(4, 40);
    RecTangle r2 = new RecTangle(3.5, 35.9);
    System.out.println(r1.height+" "+r1.width+" "+r1.getArea()+" "+r1.getPerimeter());
    System.out.println(r2.height+" "+r2.width+" "+r2.getArea()+" "+r2.getPerimeter());
    
  }
}

class RecTangle {
  double height = 1;
  double width = 1;
  
  public RecTangle() {
    // TODO Auto-generated constructor stub
  }
  
  public RecTangle(double h, double w) {
    height = ( h > 0)? h:0;
    width = (w > 0)? w:0;
  }
  
  public double getArea() {
    return height*width;
  }
  
  public double getPerimeter() {
    return 2*(height+width);
  }
  
}