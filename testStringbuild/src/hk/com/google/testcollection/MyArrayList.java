package hk.com.google.testcollection;

import java.awt.List;
import java.util.ArrayList;

import org.omg.CORBA.OBJ_ADAPTER;

/**
 * 用StringBuilder模拟一个arraylist
 * @author willard
 * @version 1.0
 */
public class MyArrayList {
	private Object list[];
	private int size;
	
	MyArrayList(){
		this(16);
	}
	MyArrayList(int size){
		if (size < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		list = new Object[size];
	}
	public int size(){
		return size;
	}
	
	public void add(Object obj){
		list[size] = obj;
		size++;
		if (size >= list.length) {
			int newcap = list.length*2 + 2;
			Object[] newlist = new Object[newcap];
			
			for (int i = 0; i < list.length; i++) {
				newlist[i] = list[i];
			}
			
			list = newlist;
		}	
	}
	public void rangeCheck(int index){
		if (index < 0 || index >= list.length) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public Object get(int index){
		rangeCheck(index);
		return list[index];
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int indexOf(Object a){
		if (a == null) {
			for (int i = 0; i < size; i++) {
				if (list[i] == null) {
					return i;
				}
			}
		}else{
			for (int i = 0; i < size; i++) {
				if (a.equals(list[i])) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public int lastIndexOf(Object a){
		if (a == null) {
			return -1;
		}else{
			for (int i = 0; i < size; i++) {
				if (a.equals(list[size -i])) {
					return size-i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		MyArrayList obj = new MyArrayList(2);
		obj.add("aaa");
		obj.add("bbb");
		obj.add(new Human("jim"));
		obj.add(235);
		obj.add("bbb");
		obj.add("ccc");
		obj.add("吃饭了没？");
		for (int i = 0; i < obj.size; i++) {
			System.out.println(obj.get(i));
			
		}
		//String h = ((Human)obj.get(2)).getName();
		System.out.println(((Human)obj.get(2)).getName());
		System.out.println("程序执行完了");
		System.out.println(obj.isEmpty());
		System.out.println(obj.indexOf("bbb"));
		System.out.println(obj.lastIndexOf("吃饭了没？"));
		
		System.out.println("************************");
		MyArrayList a = new MyArrayList(10);
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf(null));
		
	}
}
