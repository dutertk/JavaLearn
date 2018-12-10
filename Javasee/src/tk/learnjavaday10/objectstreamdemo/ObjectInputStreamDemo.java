package tk.learnjavaday10.objectstreamdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/users/tangkai/desktop/webpages/filetest/b.txt"));
		
		User user = (User)objectInputStream.readObject();
		
		System.out.println(user);
		objectInputStream.close();
	}

}
