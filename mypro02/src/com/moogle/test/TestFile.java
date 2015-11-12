package com.moogle.test;

import java.io.File;

/**
 * ����file��
 * @author willard
 *
 */
public class TestFile {
	public static void main(String[] args) {
		File f = new File("E:/temp/test");
		printFile(f,0);
	}
	
	public static void printFile(File f, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print('-');
		}
		System.out.println(f.getName());
		
		if (f.isDirectory()) {
			File[] files = f.listFiles();
			System.out.println("����" + files.length);
			/*for (File temp : files) {//��ǿ�͵�forѭ��
				printFile(temp, level+1);
			}*/
			for (int i = 0; i < files.length; i++) {
				printFile(files[i], level+1);
			}
		}
	}
}
