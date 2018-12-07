package tk.learnjavaday09;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class FileWordCount {
	public static void main(String[] args) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/users/tangkai/desktop/webpages/filetest/wordcount.txt")));
		HashMap<String, Integer> hashMap = new HashMap<>(); 
		String line = "";
		//如果必须赋值，不能直接用bufferedreader.readline()来判断，否则下面会从第二行读起
		while((line = bufferedReader.readLine()) != null){
			String[] stringWords = line.split(" ");
			for(String word : stringWords) {
				if (hashMap.containsKey(word)) {
					hashMap.put(word, hashMap.get(word)+1);
				}else {
					hashMap.put(word, 1);
				}
			}
		}
		bufferedReader.close();
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " -->> " + entry.getValue());
		}
		
	}

}
