package tk.learnjavaday10.objectstreamdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/users/tangkai/desktop/webpages/filetest/b.txt"));
		
		User user = new User("乔丹", 38, 5, 0);
		objectOutputStream.writeObject(user);//此方法要求user对象是序列化的
		objectOutputStream.close();
		
	}

}
