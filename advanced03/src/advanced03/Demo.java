package advanced03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Demo {
	public static void main(String[] args) {
		try {
			String content = "Thanks for your fish.";
			
			File file = new File("new.txt");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(content);
			bw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("IO problem.");
		}
	}
}
