package tk.learnjavaday05.hashmapdemo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet是一个集合数据类型
 * 一个具体的HashSet可以装入多个数据
 * @author tangkai
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("123");
		hashSet.add("456");
		hashSet.add("123");
		//打印(set不能有重复)
		System.out.println(hashSet.size());
		//遍历set集合
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}
}
