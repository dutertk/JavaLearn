package tk.learnjavaday04.list.demo;

import java.util.ArrayList;
/*
 * ArrayList是一种集合数据类型，可以装入任意数量的数据
 * 常用方法：
 * 添加：ArrayList.add()
 * 读取：ArrayList.get()
 * 删除：ArrayList.remove()
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		//创建一个用来装整型数据的arraylist对象
		ArrayList<Integer> arrayList =  new ArrayList<Integer>();
		
		//往arraylist中添加数据
		 arrayList.add(1);
		 arrayList.add(2);
		 arrayList.add(8);
		 
		 //读取arrayList中的数据
		 System.out.println(arrayList.get(2));
		 
		//将ArrayList中的某个位置换成某个数据
		 arrayList.set(0, 12);
		 
		 //从arraylist中移除数据
		 arrayList.remove(2);
		 
		 //遍历arrayList,取出所有的数据
		 for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		 
		 
	}
	
}
