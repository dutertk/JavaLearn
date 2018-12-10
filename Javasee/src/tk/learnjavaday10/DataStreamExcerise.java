package tk.learnjavaday10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamExcerise  {
	public static void main(String[] args) throws Exception {
	
	User userFirst = new User("卡卡", 20, 20000.0f, 40000000);
	User userSecond = new User("小罗", 25, 30000.0f, 5000000);
	
	//将两个对象写入文件
	DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("/users/tangkai/desktop/webpages/filetest/a.txt"));
	
	dataOutputStream.writeUTF(userFirst.getName());
	dataOutputStream.writeInt(userFirst.getAge());
	dataOutputStream.writeFloat(userFirst.getSalary());
	dataOutputStream.writeLong(userFirst.getHairNum());
	
	dataOutputStream.writeUTF(userSecond.getName());
	dataOutputStream.writeInt(userSecond.getAge());
	dataOutputStream.writeFloat(userSecond.getSalary());
	dataOutputStream.writeDouble(userSecond.getHairNum());
	
	dataOutputStream.close();
	
	//从文件中读取数据，恢复对象
	
	DataInputStream dataInputStream = new DataInputStream(new FileInputStream("/users/tangkai/desktop/webpages/filetest/a.txt"));
	
	String userFirstName =  dataInputStream.readUTF();
	int userFirstAge = dataInputStream.readInt();
	float useFirstSalary = dataInputStream.readFloat();
	long userFirstHairnum = dataInputStream.readLong();
	
	User user = new User(userFirstName, userFirstAge, useFirstSalary, userFirstHairnum);
	
	System.out.println(user);
	}
	
}
