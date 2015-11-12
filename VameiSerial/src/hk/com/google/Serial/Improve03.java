package hk.com.google.Serial;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.omg.CORBA.StructMemberHelper;

/**
 * 测试IO
 * @author willard
 *
 */
public class Improve03 {
	public static void main(String[] args) {
		try {
			BufferedReader	 br = new BufferedReader((new FileReader("d:/b.txt")));
			String str = br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
				
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File is not exist.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IO problem");
		} finally{
			System.out.println("程序执行完了");
		}
		
		
	}
}
