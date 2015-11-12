package liang06;

import java.lang.reflect.Array;
import java.util.DuplicateFormatFlagsException;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Demo_11_2 {
  public static void main(String[] args) {
    double[] list1 = {2, 4, 7, 10};
    double[] list2 = {2, 4, 7, 10};
    double[] list3 = {4, 2, 7, 10};
    
    System.out.println(list1.equals(list3));
    System.out.println(list2.equals(list1));
    System.out.println(java.util.Arrays.equals(list1, list2));
    System.out.println(java.util.Arrays.equals(list3, list2));
    
    double[] a = new double[10];
    for (double d : a) {
      System.out.print(d+" ");
    }
    System.out.println();
    
    java.util.Arrays.fill(a, 3, 8, 5);
    for (double d : a) {
      System.out.print(d+" ");
    }
    System.out.println();
    
    
  }
}
