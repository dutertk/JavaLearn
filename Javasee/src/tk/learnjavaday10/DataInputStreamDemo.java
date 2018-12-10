package tk.learnjavaday10;

import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputStreamDemo {
	public static void main(String[] args) throws Exception {
		DataInputStream dataInputStream = new DataInputStream(new FileInputStream("/users/tangkai/desktop/webpages/filetest/a.txt"));
		
		//int age = dataInputStream.readInt();
		
		//long year = dataInputStream.readLong();
		
		double aa = dataInputStream.readDouble();
		
		System.out.println(aa);
		
	}

}
