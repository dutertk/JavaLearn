package tk.learnjavaday05.hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * HashMap 测试用例
 * 
 * @author tangkai
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] arrayString = new String[] { "a", "b", "c", "d", "b", "b", "b", "f", "g", "d", "e", "t" };
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String string : arrayString) {
			if (hashMap.containsKey(string)) {
				int count = hashMap.get(string);
				hashMap.put(string, count + 1);
			} else {
				hashMap.put(string, 1);
			}
		}
		Set<String> set = hashMap.keySet();
		for (String string : set) {
			System.out.println(string + " ->> " + hashMap.get(string));

		}

	}
	
	

}
