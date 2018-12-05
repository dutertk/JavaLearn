package tk.learnjavaday09;

import java.io.*;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("/Users/tangkai/desktop/webpages/filetest/yuanxing.jpg");
		
		boolean directory = file.isDirectory();
		System.out.println(directory);
		
		String fileName = file.getName();
		System.out.println(fileName);
		
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		
		System.out.println(file.getParentFile().getParentFile().getName());
		File file2 = file.getParentFile().getParentFile();
		String[] list = file2.list();
		for(String liString : list) {
			System.out.println(liString);
		}
		
		
	}

}
