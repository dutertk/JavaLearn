package tk.learnjavaday04.list.demo;

import java.util.ArrayList;

public class ListDemoString {
	public static void main(String[] args) {
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("TK");
		arrayListString.add("Iphone");
		arrayListString.add("pk");
		arrayListString.add("God");
		
		//读取数据
		System.out.println(arrayListString.get(2));
		//移除数据
		arrayListString.remove(2);
		//遍历ArrayList，读取数据
		for (int i = 0; i < arrayListString.size(); i++) {
			System.out.println(arrayListString.get(i));
		}
		
	}
}
