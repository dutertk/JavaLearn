package tk.learnjavaday09.filedemo;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("/Users/tangkai/desktop/webpages/FileTest");
		file.mkdirs();
		//是否为目录
		boolean directory = file.isDirectory();
		System.out.println(directory);
		
		//获得绝对路径
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		
		//获取文件夹名称
		String fileName = file.getName();
		System.out.println(fileName);
		
		File file2 = new File("/users/tangkai/desktop/webpages/FileTest/yuanxing.jpg");
		
		//获取文件名称
		String name = file2.getName();
		System.out.println(name);
		
		//获取文件的长度（字节）
		long fileLength = file2.length();
		System.out.println(fileLength);
		
		//list方法用例
		File file3 = new File("/Users/tangkai/desktop/webpages");
		//相当于linux中的ls命令，即当前目录下的所有文件；
		String[] fileList = file3.list();
		for(String filelist : fileList){
			System.out.println(filelist);
		}
		
		
	}
	
	

}
