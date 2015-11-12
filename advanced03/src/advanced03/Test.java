package advanced03;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
	public static void main(String[] args) {
		try {
			//文件路径中的 '\'需要转义 \\,或者使用 linux的符号 '/'
			
			//BufferedReader br = new BufferedReader(new FileReader("E:\\Users\\workspace\\advanced03\\src\\advanced03\\file.txt"));
			//BufferedReader br = new BufferedReader(new FileReader("E:/Users/workspace/advanced03/src/advanced03/file.txt"));
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));//文件需要放在项目跟目录下
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				
			br.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("IO exception.");
		}
		
	}
}
