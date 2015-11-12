package hk.com.google.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestTryCatch {
	static FileReader reader = null;
	
	public static void main(String[] args) {
		System.out.println(test());
	}
	public static String test(){
		try {
			reader = new FileReader("d:/b.txt");
			char c = (char)reader.read();
			System.out.println(c);
			return "step1";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "step2";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally{
			//return "step3";
			
			try {
				if (reader != null) {
				reader.close();
				return "step4";
			}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("我被执行了");
		}
		return "step5";
	
	}
}
