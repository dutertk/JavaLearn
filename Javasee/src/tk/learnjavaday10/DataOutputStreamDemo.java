package tk.learnjavaday10;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * dataoutputstream是一个包装流，可以将各种类型的数据在内部转成byte字节，
 * 然后利用fileoutputstream写入文件
 * @author tangkai
 *
 */
public class DataOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("/users/tangkai/desktop/webpages/filetest/a.txt"));
		
		//写入一个整数
		int a = 12;
		//dataOutputStream.writeInt(a);
		
		//写一个long
		//dataOutputStream.writeLong(1999);
		
		//写一个double
		dataOutputStream.writeDouble(255.3);
		
		
		dataOutputStream.close();
		
	}

}
